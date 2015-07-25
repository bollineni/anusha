package Constructor;

public class Employee {
 
	public String name;
	public int employee_id;
	public int salary;
	public String designation;
	public String ssn;
	public int age;
	
	//create a constructor
	public Employee(String name,int employee_id){
		this.name=name;
		this.employee_id=employee_id;
	}
	public Employee(String assignname,int assignemployee_id,int assignsalary){
		this(assignname,assignemployee_id);
		salary=assignsalary;
	}
	public Employee(String name,int employee_id,int salary,String designation){
		this(name,employee_id,salary);
		this.designation=designation; 
	}	
	/*public Employee(String assignname,int assignemployee_id,int assignsalary,String assigndesignation){
		this(assignname,assignemployee_id,assignsalary);
		designation=assigndesignation;
	}*/
	public Employee(String name,int employee_id,int salary, String designation , String ssn, int age){
		this(name,employee_id,salary,designation);
		this.ssn= ssn;	
		this.age = age;
		
		
	}
}
	