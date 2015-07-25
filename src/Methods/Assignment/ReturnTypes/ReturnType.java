package Methods.Assignment.ReturnTypes;

import Methods.Assignment.Clients.Employee;

public class ReturnType {

	public static void main(String[] args) {
     
		ReturnType rte =  new ReturnType();
		Calculation calc = new Calculation();
		Employee emp1 = new Employee("anusha",1001,120000,1200);
		calc.doCalculation(15,4,5);
		calc.doCalculation(20, 6, 4, 3);
		String dou = calc.add(2,3) + " "; // converting int to string
		
		//using multiple messages
		
	  
	  System.out.println("Hi" + " " + calc.getName("Nuzhat", "Beig") + " " + "How are you");
		
	
		System.out.println(); 
		
	   System.out.println(emp1.getSalary());
	}

}
