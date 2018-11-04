package uk.ac.uos.hwpoli;

public class DescribeNumber {
	
	
	double number;
	
	
	public String outNumber (double n) {
		
		String s = "error";
		
		if (n==0)
			s = "zero";
		else if (0<=n && n<1)
			s = ".";
		else if (1<=n && n<2)
			s = "one";
		else if (2<=n && n<3)
			s = "two";
		else if (3<=n && n<4)
			s = "three";
		else if (4<=n && n<5)
			s = "four";
		else if (5<=n && n<6)
			s = "five";
		else if (6<=n && n<7)
			s = "six";
		else if (7<=n && n<8)
			s = "seven";
		else if (8<=n && n<9)
			s = "eith";
		else if (9<=n && n<10)
			s = "nine";
		
		//10 to 11
		else if (10<=n && n<11)
			s = "ten";
		else if (11<=n && n<12)
			s = "eleven";
		else if (12<=n && n<13)
			s = "twelve";
		else if (13<=n && n<14)
			s = "thirteen";
		else if (14<=n && n<15)
			s = "fourteen";
		else if (15<=n && n<16)
			s = "fiveteen";
		else if (16<=n && n<17)
			s = "sixteen";
		else if (17<=n && n<18)
			s = "seventeen";
		else if (18<=n && n<19)
			s = "eithteen";
		else if (19<=n && n<20)
			s = "nineteen";
		else if (20<n)
			s = outDec(n);
		
		return s;
		
	}
	

	public String outDec(double n) {
		String s="Error";
		
		
		
		return s;
	}
	

}
