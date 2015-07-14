package Operators;

public class BooleanLogicalOperatorAssignments {

	public static void main(String[] args) {
		int urage=10;
		int myage=23;
		//boolean checkCondition=((urage>20)&(myage>20));
		//boolean checkCondition=((urage>20)&&(myage>20));
		//boolean checkCondition=((urage>20)|(myage>20));
		boolean checkCondition=((urage>20)||(myage>20));
		String message=checkCondition ?"we are adults":"we are not";
        System.out.println(message);
	
	}

}
