package it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany;

/**
* it/imolinfo/jbi4corba/test/webservice/generator/echocomplex/typedefany/ValueTypeOfValueTypeHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from EchoTypeDefAny.idl
* mercoledý 10 febbraio 2010 15.46.41 CET
*/

public final class ValueTypeOfValueTypeHolder implements org.omg.CORBA.portable.Streamable
{
  public it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.ValueTypeOfValueType value = null;

  public ValueTypeOfValueTypeHolder ()
  {
  }

  public ValueTypeOfValueTypeHolder (it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.ValueTypeOfValueType initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.ValueTypeOfValueTypeHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.ValueTypeOfValueTypeHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return it.imolinfo.jbi4corba.test.webservice.generator.echocomplex.typedefany.ValueTypeOfValueTypeHelper.type ();
  }

}
