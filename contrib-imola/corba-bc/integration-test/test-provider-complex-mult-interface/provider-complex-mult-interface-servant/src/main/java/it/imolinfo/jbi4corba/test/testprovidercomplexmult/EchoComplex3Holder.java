package it.imolinfo.jbi4corba.test.testprovidercomplexmult;

/**
* it/imolinfo/jbi4corba/test/testprovidercomplexmult/EchoComplex3Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EchoMultipleComplex.idl
* mercoledý 19 novembre 2008 17.11.46 CET
*/

public final class EchoComplex3Holder implements org.omg.CORBA.portable.Streamable
{
  public it.imolinfo.jbi4corba.test.testprovidercomplexmult.EchoComplex3 value = null;

  public EchoComplex3Holder ()
  {
  }

  public EchoComplex3Holder (it.imolinfo.jbi4corba.test.testprovidercomplexmult.EchoComplex3 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = it.imolinfo.jbi4corba.test.testprovidercomplexmult.EchoComplex3Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    it.imolinfo.jbi4corba.test.testprovidercomplexmult.EchoComplex3Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return it.imolinfo.jbi4corba.test.testprovidercomplexmult.EchoComplex3Helper.type ();
  }

}
