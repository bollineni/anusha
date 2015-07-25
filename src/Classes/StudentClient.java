package Classes;

/*class Student {
	String name;
	int rollNumber;
	int height;
	int grade;
}*/

public class StudentClient {

	public static void main(String[] args) {
		Student studOne = new Student();
		studOne.name = "anusha";
		studOne.grade = 3;

		Student studTwo = new Student();
		studTwo.name = "rajesh";
		studTwo.grade = 6;
		
		System.out.println(studOne.name);
		System.out.println(studTwo.name);
	}

	

}
