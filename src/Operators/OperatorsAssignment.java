package Operators;
public class OperatorsAssignment {

	public static void main(String[] args) {
		int a=10;
		int b=15;
		int c=20; //add,sub,mul,div,modulus
		int numberofDaysCount = 10;
		/*
		System.out.println("Addition  :" + (a+b+c));
		System.out.println("subtraction " + (c-a));
		System.out.println("multiplication " + (b*c));
		System.out.println("division " + (a/b));
		System.out.println("modulus " + (a%c));
	    */
		/*
		System.out.println("numberofDaysCount " + numberofDaysCount--);
        System.out.println("numberofDaysCount " + --numberofDaysCount); 
        System.out.println("numberofDaysCount " + numberofDaysCount--);
        System.out.println("numberofDaysCount " + numberofDaysCount--);
        */
		
		System.out.println("numberofDaysCount " + --numberofDaysCount);
        System.out.println("numberofDaysCount " + --numberofDaysCount); 
        System.out.println("numberofDaysCount " + numberofDaysCount--);
        System.out.println("numberofDaysCount " + --numberofDaysCount);
        numberofDaysCount-=9;
        numberofDaysCount+=8;
        numberofDaysCount*=8;
        numberofDaysCount/=5;
        numberofDaysCount%=5;
        System.out.println("numOfDaysCount " +  numberofDaysCount);
        
	}

}