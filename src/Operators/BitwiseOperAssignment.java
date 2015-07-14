package Operators;
public class BitwiseOperAssignment {

	public static void main(String[] args) {

		int a=5; 		
		int b=7; 
		int c=a|b; 
		System.out.println(c);
		int d=a&b; 
		System.out.println(d);
		int e=a^b; 
		System.out.println(e);
		int f=(~a&b)|(a&~b); 
		System.out.println(f);
		int g=~a&0x0f;
		System.out.println(g);
		

	}

}