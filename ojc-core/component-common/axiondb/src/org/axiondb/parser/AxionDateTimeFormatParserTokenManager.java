/* Generated By:JavaCC: Do not edit this line. AxionDateTimeFormatParserTokenManager.java */
package org.axiondb.parser;

public class AxionDateTimeFormatParserTokenManager implements AxionDateTimeFormatParserConstants
{
  public  java.io.PrintStream debugStream = System.out;
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 32:
         return jjStopAtPos(0, 31);
      case 40:
         return jjStopAtPos(0, 26);
      case 41:
         return jjStopAtPos(0, 27);
      case 44:
         return jjStopAtPos(0, 22);
      case 45:
         return jjStopAtPos(0, 28);
      case 46:
         return jjStopAtPos(0, 25);
      case 47:
         return jjStopAtPos(0, 29);
      case 58:
         return jjStopAtPos(0, 23);
      case 59:
         return jjStopAtPos(0, 24);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x200000L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x3eL);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      case 72:
      case 104:
         jjmatchedKind = 13;
         return jjMoveStringLiteralDfa1_0(0xd000L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x101c0L);
      case 81:
      case 113:
         return jjStopAtPos(0, 19);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 84:
      case 116:
         return jjStopAtPos(0, 30);
      case 87:
      case 119:
         return jjStopAtPos(0, 18);
      case 89:
      case 121:
         return jjMoveStringLiteralDfa1_0(0x600L);
      default :
         return 1;
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 1;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x8L);
      case 67:
      case 99:
         if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(1, 11);
         break;
      case 68:
      case 100:
         if ((active0 & 0x20L) != 0L)
         {
            jjmatchedKind = 5;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x10L);
      case 70:
      case 102:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(1, 20);
         break;
      case 72:
      case 104:
         if ((active0 & 0x1000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xc000L);
      case 73:
      case 105:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 77:
      case 109:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(1, 6);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(1, 21);
         break;
      case 79:
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x182L);
      case 83:
      case 115:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      case 89:
      case 121:
         if ((active0 & 0x4L) != 0L)
            return jjStopAtPos(1, 2);
         else if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 10;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      default :
         return 2;
   }
   return 2;
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 2;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 2;
   }
   switch(curChar)
   {
      case 49:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 50:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 68:
      case 100:
         if ((active0 & 0x10L) != 0L)
            return jjStopAtPos(2, 4);
         break;
      case 78:
      case 110:
         if ((active0 & 0x80L) != 0L)
         {
            jjmatchedKind = 7;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 87:
      case 119:
         if ((active0 & 0x2L) != 0L)
            return jjStopAtPos(2, 1);
         break;
      case 89:
      case 121:
         if ((active0 & 0x8L) != 0L)
            return jjStopAtPos(2, 3);
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      default :
         return 3;
   }
   return 3;
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 3;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 3;
   }
   switch(curChar)
   {
      case 50:
         if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(3, 14);
         break;
      case 52:
         if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(3, 15);
         break;
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x100L);
      case 89:
      case 121:
         if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(3, 9);
         break;
      default :
         return 4;
   }
   return 4;
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return 4;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      return 4;
   }
   switch(curChar)
   {
      case 72:
      case 104:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(4, 8);
         break;
      default :
         return 5;
   }
   return 5;
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, "\54", "\72", "\73", "\56", 
"\50", "\51", "\55", "\57", null, "\40", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[0];
//private final int[] jjstateSet = new int[0];
protected char curChar;
public AxionDateTimeFormatParserTokenManager(SimpleCharStream stream)
{
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public AxionDateTimeFormatParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 0; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
  //int kind;
  //Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  //EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
         matchedToken = jjFillToken();
         return matchedToken;
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}

