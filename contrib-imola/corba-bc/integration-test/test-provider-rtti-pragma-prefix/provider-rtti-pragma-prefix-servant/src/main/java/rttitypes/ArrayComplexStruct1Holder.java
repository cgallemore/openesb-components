package rttitypes;


/**
* rttitypes/ArrayComplexStruct1Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from RttiPragmaPrefix.idl
* Wednesday, July 22, 2009 4:13:00 PM CEST
*/

public final class ArrayComplexStruct1Holder implements org.omg.CORBA.portable.Streamable
{
  public rttitypes.ComplexStruct1 value[][] = null;

  public ArrayComplexStruct1Holder ()
  {
  }

  public ArrayComplexStruct1Holder (rttitypes.ComplexStruct1[][] initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = rttitypes.ArrayComplexStruct1Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    rttitypes.ArrayComplexStruct1Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return rttitypes.ArrayComplexStruct1Helper.type ();
  }

}
