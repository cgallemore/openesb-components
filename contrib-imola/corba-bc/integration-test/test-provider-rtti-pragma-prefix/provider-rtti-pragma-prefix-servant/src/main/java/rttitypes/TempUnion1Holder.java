package rttitypes;

/**
* rttitypes/TempUnion1Holder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from RttiPragmaPrefix.idl
* Wednesday, July 22, 2009 4:13:00 PM CEST
*/

public final class TempUnion1Holder implements org.omg.CORBA.portable.Streamable
{
  public rttitypes.TempUnion1 value = null;

  public TempUnion1Holder ()
  {
  }

  public TempUnion1Holder (rttitypes.TempUnion1 initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = rttitypes.TempUnion1Helper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    rttitypes.TempUnion1Helper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return rttitypes.TempUnion1Helper.type ();
  }

}
