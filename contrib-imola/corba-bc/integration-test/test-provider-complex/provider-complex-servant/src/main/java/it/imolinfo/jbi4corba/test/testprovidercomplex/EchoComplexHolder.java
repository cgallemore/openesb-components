package it.imolinfo.jbi4corba.test.testprovidercomplex;

/**
* it/imolinfo/jbi4corba/test/testprovidercomplex/EchoComplexHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from provider-complex-jbi4corba-provider/src/main/resources/EchoComplex.idl
* Tuesday, September 11, 2007 3:26:57 PM CEST
*/


//==================================================
public final class EchoComplexHolder implements org.omg.CORBA.portable.Streamable
{
  public it.imolinfo.jbi4corba.test.testprovidercomplex.EchoComplex value = null;

  public EchoComplexHolder ()
  {
  }

  public EchoComplexHolder (it.imolinfo.jbi4corba.test.testprovidercomplex.EchoComplex initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = it.imolinfo.jbi4corba.test.testprovidercomplex.EchoComplexHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    it.imolinfo.jbi4corba.test.testprovidercomplex.EchoComplexHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return it.imolinfo.jbi4corba.test.testprovidercomplex.EchoComplexHelper.type ();
  }

}
