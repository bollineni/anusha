package Methods.Assignment.School;

public class Student {

	private String name;
	private int rollNumber;
	private int grade;
	private int height;
	private String teacher;
	public static int count;

	public String getName() {
		return name;
	}

	public int getRollNumber() {
		return rollNumber;

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getHeight() {
		return height;

	}

	public void setHeight(int height) {
		if (height <= 0) {
			this.height = 3;
		} else {
			this.height = height;
		}
	}
	public String getTeacher() {
		return teacher;
	}
	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}
	 // creating a constructor
	 
	 public Student(String name, int rollNumber){
		 this.name = name;
		 this.rollNumber = rollNumber;
		 count++;
	 }
	//Overloading the constructor
		 public Student(String assignedName, int assignedRollNumber, int assignedGrade){
			 this(assignedName, assignedRollNumber);
			 grade = assignedGrade;
			 
		 }
		 public Student(String assignedName, int assignedRollNumber, int assignedGrade , int assignedHeight){
			 this(assignedName, assignedRollNumber , assignedGrade);
			 height = assignedHeight;
		 }
		// creating a Method
		 
		 public void printStudentInfo(){
			 System.out.println(getInfo());
		 }
		 public void printStudentInfo(String message){
			 System.out.println(message + " " +getInfo());
		 }
		 
		 private String getInfo(){
			 return this.name+ " " + " " + this.rollNumber + " " + this.grade ;
		 }
		
		 public static void callMe(){
			 
		 }
}
