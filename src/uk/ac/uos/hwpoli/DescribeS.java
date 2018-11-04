package uk.ac.uos.hwpoli;

public class DescribeS implements Theinterface {

	String s;
	
	public DescribeS () {
	s="hey I got something";
	
	}
	
	@Override public String describe() {
		
		return "\"" + s + "\"";
	}
	
	
}
