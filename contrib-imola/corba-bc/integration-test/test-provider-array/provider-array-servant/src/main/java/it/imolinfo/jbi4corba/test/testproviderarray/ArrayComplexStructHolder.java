package it.imolinfo.jbi4corba.test.testproviderarray;


/**
* it/imolinfo/jbi4corba/test/testproviderarray/ArrayComplexStructHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EchoArray.idl
* venerd� 20 febbraio 2009 12.20.53 CET
*/

public final class ArrayComplexStructHolder implements org.omg.CORBA.portable.Streamable
{
  public it.imolinfo.jbi4corba.test.testproviderarray.ComplexStruct value[] = null;

  public ArrayComplexStructHolder ()
  {
  }

  public ArrayComplexStructHolder (it.imolinfo.jbi4corba.test.testproviderarray.ComplexStruct[] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = it.imolinfo.jbi4corba.test.testproviderarray.ArrayComplexStructHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    it.imolinfo.jbi4corba.test.testproviderarray.ArrayComplexStructHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return it.imolinfo.jbi4corba.test.testproviderarray.ArrayComplexStructHelper.type ();
  }

}
