package uk.ac.uos.hwpoli;

class Theclass implements Theiterface {
	
	String s;
	
	public Theclass() {
		
		s="hey I got something";
	}
	
	@Override public String describe() {
		
		return "\"" + s + "\"";
	}

	
}
