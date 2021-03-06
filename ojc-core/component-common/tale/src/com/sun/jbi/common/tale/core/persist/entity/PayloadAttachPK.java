/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sun.jbi.common.tale.core.persist.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author echou
 */
@Embeddable
public class PayloadAttachPK implements Serializable {
    @Column(name = "MESG_ID", nullable = false)
    private String mesgId;
    @Column(name = "SEQUENCE_ID", nullable = false)
    private String sequenceId;

    public PayloadAttachPK() {
    }

    public PayloadAttachPK(String mesgId, String sequenceId) {
        this.mesgId = mesgId;
        this.sequenceId = sequenceId;
    }

    public String getMesgId() {
        return mesgId;
    }

    public void setMesgId(String mesgId) {
        this.mesgId = mesgId;
    }

    public String getSequenceId() {
        return sequenceId;
    }

    public void setSequenceId(String sequenceId) {
        this.sequenceId = sequenceId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (mesgId != null ? mesgId.hashCode() : 0);
        hash += (sequenceId != null ? sequenceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PayloadAttachPK)) {
            return false;
        }
        PayloadAttachPK other = (PayloadAttachPK) object;
        if ((this.mesgId == null && other.mesgId != null) || (this.mesgId != null && !this.mesgId.equals(other.mesgId))) {
            return false;
        }
        if ((this.sequenceId == null && other.sequenceId != null) || (this.sequenceId != null && !this.sequenceId.equals(other.sequenceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sun.jbi.engine.ale.core.persist.entity.PayloadAttachPK[mesgId=" + mesgId + ", sequenceId=" + sequenceId + "]";
    }

}
