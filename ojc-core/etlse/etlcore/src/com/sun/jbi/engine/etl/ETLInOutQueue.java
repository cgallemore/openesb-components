package com.sun.jbi.engine.etl;

import com.sun.etl.engine.spi.DBConnectionProvider;
import com.sun.jbi.engine.etl.persistence.BaseDAO;
import com.sun.jbi.engine.etl.persistence.DAOFactory;
import com.sun.jbi.internationalization.Messages;
import com.sun.jbi.engine.etl.persistence.impl.MessagePersistenceHandler;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manish
 */
public class ETLInOutQueue extends Thread {

    //ETL Queue
    private Queue<ETLInOutQueueElement> inOutMsgsQueue = null;
    
    //Thread variables
    private Boolean pollingIsAlive = true;
    private Boolean pollingIsActive = false;
    
    private static transient final Logger mLogger = Logger.getLogger(ETLInOutQueue.class.getName());
    private static final Messages mMessages = Messages.getMessages(ETLInOutQueue.class);
    
    
    //Others
    private ETLSEInOutThread etlthread = null;

    /** Creates a new instance of ETL Msg InOut Queue */
    public ETLInOutQueue() {
        inOutMsgsQueue = new LinkedList<ETLInOutQueueElement>();
    }
    
    /** Creates a new instance of ETL Msg InOut Queue */
    public ETLInOutQueue(ETLSEInOutThread etlth ) {
        inOutMsgsQueue = new LinkedList<ETLInOutQueueElement>();
        this.etlthread = etlth;
    }    
    
    public void restore(String jndiResName) {
        if(!MessagePersistenceHandler.isPersistenceEnabled()) return;
        DBConnectionProvider connProvider = new ETLSEDBConnectionProvider();
        Connection conn = null;
        Statement stmt = null;
        int DERBY_DB_TYPE = 0;
        try {
            conn = MessagePersistenceHandler.getConnection(jndiResName);
            //mLogger.info("got db connection to derby");
            DAOFactory factory = DAOFactory.getDAOFactory(DERBY_DB_TYPE);
            BaseDAO dao = factory.createETLMessagePipelineDAO();
            mLogger.log(Level.INFO, mMessages.getString("ETLSE-I0100.restore_SQL")+dao.getQueryStmt());
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(dao.getQueryStmt());
            while (rs.next()) {
                String mesgExId = rs.getString(1);
                String serviceName = rs.getString(2);
                String operationName = rs.getString(3);
                String normalizedMessageContent = rs.getString(4);
                int status = rs.getInt(5);
                ETLInOutQueueElement element = new ETLInOutQueueElement(mesgExId, normalizedMessageContent, serviceName, operationName);
                this.pushIntoQueue(element);
            }
        } catch (SQLException e) {
            mLogger.log(Level.SEVERE, e.getMessage());
        } catch (Exception e) {
            mLogger.log(Level.SEVERE,  e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                mLogger.log(Level.SEVERE, mMessages.getString("ETLSE-S0200.messageRestoration_Failure")+e.getMessage());
            }
        }
    }

    
    /**
     * 
     * Process the Incoming Message Exchange Here the incoming data here.
     */
    private void processData() {
        //mLogger.log(Level.SEVERE, "in processData");
        if (this.inOutMsgsQueue.peek() != null) {
            ETLInOutQueueElement inOutMsgObj = (ETLInOutQueueElement) this.inOutMsgsQueue.poll();
            if (!pollingIsActive) {
                pollingIsActive = true;
            }
            if (inOutMsgObj != null) {
                mLogger.log(Level.SEVERE, "inOutMsg");
                this.etlthread.handleInOutMessage(inOutMsgObj);
            }
        } else {
            // Queue does not contain any data, polling may be suspended till inturrupted.
            if (pollingIsActive) {
                pollingIsActive = false;
            }
            goSleep(60000);
        }
    }

    /**
     * 
     * Push the Incoming Messages into the Queue
     */
    public boolean pushIntoQueue(ETLInOutQueueElement element) {
        mLogger.log(Level.SEVERE,mMessages.getString("ETLSE-S0201.ReceivingMessage")+ element.getNormalizedMsg());
        Boolean offer_status = false;
        offer_status = this.inOutMsgsQueue.offer(element);
        if (offer_status){
            //Check if polling thread needs to be inturrupted
            if (!this.pollingIsActive){
                this.interrupt();
            }
        }
        return offer_status;
    }

    /**
     * 
     * Stop Running the ETL Queue Thread
     */
    public void stopPollingETLInOutQueue() {
        this.pollingIsActive = false;
        this.pollingIsAlive = false;
    }

    /**
     * Run Method of the Thread
     */
    public void run() {
        //mLogger.log(Level.FINE,mMessages.getString("ETLSE-F0300.thread_Started"));
        while (pollingIsAlive) {
            processData();
        }

        mLogger.log(Level.FINE,mMessages.getString("ETLSE-F0301.ETL_QueueThread_Stalled"));
    }
    
    private void goSleep(long seconds){
        try {
            Thread.sleep(seconds * 1000);
            mLogger.log(Level.FINE,mMessages.getString("ETLSE-F0302.QueuePoller_sleeping",seconds));
        } catch (InterruptedException ex) {
            mLogger.log(Level.SEVERE,mMessages.getString("ETLSE-S0202.QueueThread_Inturrupted"));
        }
    }
    
}
