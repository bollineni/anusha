package Methods.Assignment.Clients;

public class Client {

	public static void main(String[] args) {
		Employee emp1 = new Employee("anusha",1001,120000,1200);
		emp1.printEmpInfo();
		emp1.printEmpInfo("Hello");
		emp1.printEmpInfo("This is for");
		System.out.println(emp1.getName());
		System.out.println(emp1.getGrossSalary());
		System.out.println(emp1.getEmp_id());
		emp1.grossSalary("This is the salary of" );
		System.out.println("Hello" + " "+ emp1.getInfo() + " " + " this is right" );
		
		System.out.println();
		
		/*	Employee emp2 = new Employee("Steve",1002,65000,650);
		emp2.printEmpInfo();
		emp2.printEmpInfo("Hello");
		emp2.printEmpInfo("This is for");
		//emp2.getName();
		System.out.println(emp2.getName());
		//emp2.getInfo();
		
		System.out.println();
		
		Employee emp3 = new Employee("Sam",1003,85600,856,"Project Engineer");
		emp3.printEmpInfo();
		emp3.printEmpInfo("Hello");
		emp3.printEmpInfo("This is for");
		//System.out.println(emp3.name + " " + emp3.emp_id + " " + emp3.salary + " " + emp3.designation);
		
		System.out.println();
		
		Employee emp4 = new Employee("Fawn",1004,110012,444,"Supervisor","7431233324",28);
		emp4.printEmpInfo();
		emp4.printEmpInfo("Hello");
		emp4.printEmpInfo("This is for");
		//System.out.println(emp4.name + " " + emp4.emp_id + " " + emp4.salary + " " + emp4.designation + " " + emp4.age);
		
		System.out.println();
		*/
	}

}
