package Operators;

public class BooleanLogicalOperator1 {

	public static void main(String[] args) {
		int age=Integer.parseInt(args[0]);
		
		//System.out.println("I am more than 10 Yrs");//? is ternary operator
		//System.out.println("I am less than 10 Yrs");
			
		String message = (age > 10) ? "I am more then 10 Yrs" : "I am less than 10 Yrs";
		 System.out.println(message);
	
	}

}
