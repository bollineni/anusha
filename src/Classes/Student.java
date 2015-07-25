package Classes;

public class Student {
	private String name;
	private int rollNumber;
	private int height;
	private int grade;

	public String getName() {
		return name;
	}
	
    public int getrollNumber(){
    	return rollNumber;
    }
    
  public void setHeight(int height) {
		this.height = height;
	}

	public Student(String Name, int assignRollNumber) {
		this.name = Name;
		rollNumber = assignRollNumber;
	}

	public Student(String assignedName, int assignRollNumber, int assignGrade) {
		/* name=assignedName; rollNumber=assignRollNumber; */

		this(assignedName, assignRollNumber);
		grade = assignGrade;
	}

	public Student(String assignedName, int assignRollNumber, int assignGrade,
			int assignHeight) {
		this(assignedName, assignRollNumber, assignGrade);
		height = assignHeight;
	}

	public Student(int assignRollNumber, String assignedName, int assignGrade) {
		name = assignedName;
		rollNumber = assignRollNumber;
		grade = assignGrade;
	}

	public void printStudentInfo() {
		// System.out.println(this.name+" "+rollNumber+" "+grade);
		System.out.println(getInfo());
	}

	public void printStudentInfo(String msg) {
		// System.out.println(msg+" " +this.name+" "+rollNumber+" "+grade);
		System.out.println(msg + " " + getInfo());
	}

	/* public void printStudentInfoHello(){
	    System.out.println("Hello "+this.name+" "+rollNumber); 
	    }*/
	private String getInfo() {
		return this.name + " " + rollNumber + " " + grade+" "+height;
	}
	public String toString(){
		//return super.toString();
		return name+" "+ rollNumber+" "+grade;
	}

}
