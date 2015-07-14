package Operators;

public class BooleanLogicalOperator2 {

	public static void main(String[] args) {

		int urage=Integer.parseInt(args[0]); 
		int myage=Integer.parseInt(args[1]); 
		boolean checkCondition = ((urage > 20) & (myage > 20));
		
		//String message = ((urage > 20) & (myage > 20)) ? "We are adults" : "We are not"; 
		//String message = ((urage > 20) & (myage >=20)) ? "We are adults" : "We are not"; 
		String message = checkCondition ? "We are adults" : "We are not";
		//String playmessage = checkCondition ? "We are allowed to play" : "We are not allowed to play";
		String playmessage = ((urage>20)&(myage>20))? "We are allowed to play" : "We are not allowed to play";
				
				System.out.println(message); 
		
	}

}
