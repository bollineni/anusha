package Constructor;

public class Company {
	public static void main(String[] args) {
		Employee emp1 = new Employee("anusha",1001);
		System.out.println(emp1.name +" " + emp1.employee_id);
		
		Employee emp2 = new Employee("rajesh",1002,12020);
		System.out.println(emp2.name + " " + emp2.employee_id + " " + emp2.salary);
		
		Employee emp3 = new Employee("anu",1003,130233,"Project Engineer");
		System.out.println(emp3.name + " " + emp3.employee_id + " " + emp3.salary + " " + emp3.designation);
		
		Employee emp4 = new Employee("baby",1004,110016,"Manager","7431233324",28);
		System.out.println(emp4.name + " " + emp4.employee_id + " " + emp4.salary + " " + emp4.designation + " " +emp4.ssn+" "+emp4.age);
	}
}
