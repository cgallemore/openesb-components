package it.imolinfo.jbi4corba.test.testprovideranytypes;


/**
* it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypesPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from F:/imolaCSV/nokia/open-jbi-components/contrib-imola/corba-bc/integration-test/test-provider-anytypes/provider-anytypes-jbi4corba-provider/src/main/resources/AnyTypes.idl
* luned� 2 febbraio 2009 12.26.09 EET
*/

public abstract class EchoAnyTypesPOA extends org.omg.PortableServer.Servant
 implements it.imolinfo.jbi4corba.test.testprovideranytypes.EchoAnyTypesOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("echo1", new java.lang.Integer (0));
    _methods.put ("echo2", new java.lang.Integer (1));
    _methods.put ("echo3", new java.lang.Integer (2));
    _methods.put ("echo4", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypes/echo1
       {
         org.omg.CORBA.AnyHolder msg = new org.omg.CORBA.AnyHolder ();
         msg.value = in.read_any ();
         String $result = null;
         $result = this.echo1 (msg);
         out = $rh.createReply();
         out.write_string ($result);
         out.write_any (msg.value);
         break;
       }

       case 1:  // it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypes/echo2
       {
         try {
           org.omg.CORBA.Any msg = in.read_any ();
           org.omg.CORBA.Any $result = null;
           $result = this.echo2 (msg);
           out = $rh.createReply();
           out.write_any ($result);
         } catch (it.imolinfo.jbi4corba.test.testprovideranytypes.EchoAnyException $ex) {
           out = $rh.createExceptionReply ();
           it.imolinfo.jbi4corba.test.testprovideranytypes.EchoAnyExceptionHelper.write (out, $ex);
         }
         break;
       }

       case 2:  // it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypes/echo3
       {
         it.imolinfo.jbi4corba.test.testprovideranytypes.TempUnion msg = it.imolinfo.jbi4corba.test.testprovideranytypes.TempUnionHelper.read (in);
         it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1 $result = null;
         $result = this.echo3 (msg);
         out = $rh.createReply();
         it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1Helper.write (out, $result);
         break;
       }

       case 3:  // it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypes/echo4
       {
         it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1Holder msg = new it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1Holder ();
         msg.value = it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1Helper.read (in);
         org.omg.CORBA.Any $result[][] = null;
         $result = this.echo4 (msg);
         out = $rh.createReply();
         it.imolinfo.jbi4corba.test.testprovideranytypes.ArrayOfAnyHelper.write (out, $result);
         it.imolinfo.jbi4corba.test.testprovideranytypes.ComplexStruct1Helper.write (out, msg.value);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:it/imolinfo/jbi4corba/test/testprovideranytypes/EchoAnyTypes:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public EchoAnyTypes _this() 
  {
    return EchoAnyTypesHelper.narrow(
    super._this_object());
  }

  public EchoAnyTypes _this(org.omg.CORBA.ORB orb) 
  {
    return EchoAnyTypesHelper.narrow(
    super._this_object(orb));
  }


} // class EchoAnyTypesPOA
