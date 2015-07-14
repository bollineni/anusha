package Operators;

public class BooleanLogicalOperator3 {

	public static void main(String[] args) {
		
		int urage= 10;//Integer.parseInt(args[0]); 
		int myage=23;//Integer.parseInt(args[1]); 
		
		//boolean checkCondition = ((urage > 20) & (myage > 20));
		boolean checkCondition = ((urage++ > 20) & (myage >= 20));
		
		System.out.println(" urage "+urage );
		System.out.println(" myage "+myage );
			
			
			
		}
	
	}


