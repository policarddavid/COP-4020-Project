package edu.ufl.cise.plc;

public class Token implements IToken {
	
	final Kind kind;
	final String input;
	final int pos;
	final int length;
	
	public Token(Kind kind, String input, int pos, int length)
	{
		this.kind = kind;
		this.input = input;
		this.pos = pos;
		this.length = length;
		
		
	}
	
	@Override public Kind getKind() 
	{
		return kind;
	}
	
	@Override String getText()
	{
	
	}
	
	@Override SourceLocation getSourcePosition()
	{
		 
	} 
	
	@Override int getIntValue()
	{
		
	}
	
	@Override float getFloatValue()
	{
		
	}
	
	@Override boolean getBooleanValue()
	{
		
	}
	
	@Override String getStringValue()
	{
		
	}
	
	
	

}
