package Operators;

public class TernaryOperator {

	public static void main(String[] args) {
        int age=19;
        String name=(age>18)? "Adult" : "child";
        if(age<18){
        	name="One";
        }
        else
        	if(age>18 && age<21){
        		name="Two";
        		/*if(true){
        			
        		}*/
        }
        	else
        		if(age>21){
        			name="Three";
        		}
        		else{
        			name="nothing";
        		}
                    System.out.println(name);
        			if(age==18){
        				name="18";
        			}
        	else
        		if(age==19){
        			name="19";
        		}
        		else
        			if(age==21){
        				name="21";
        			}
        			else{
        				name="nothing";
        			}
        			System.out.println(name);
        		if(age==18){
        		  name="18";
        			}
        		if(age==19){
        			name="19";
        		}
        			if(age==21){
        				name="21";
        			}
        			System.out.println(name);
	}
}
