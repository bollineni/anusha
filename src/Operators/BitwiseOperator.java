package Operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		String binary[]={"0000","0001","0010","0011","0100","0101","0110","0111",
		 "1000","1001","1010","1011","1100","1101","1110","1111" };	
		
		int a=3; // 0+2+1 or 0011 in binary
		int b=6; // 4+2+0 or 0110 in binary
		int c=a|b; // | is Or symbol
		System.out.println(c);
		int d=a&b; // & is ADD symbol
		System.out.println(d);
		int e=a^b; // ^ is XOR symbol 
		System.out.println(e);
		int f=(~a&b)|(a&~b); // ~ is NOR symbol
		System.out.println(f);
		int g=~a&0x0f; // 0x0f is the hexadecimal representation for 15
		System.out.println(g);
		System.out.println("a= "+ binary[a]);
		System.out.println("b= "+ binary[b]);
		System.out.println("a|b= "+ binary[c]);
		System.out.println("a&b= "+ binary[d]);
		System.out.println("a&b)|(a&~b)= "+ binary[e]);
		System.out.println("~a&0x0f= "+binary[g]);
	}

}
