package Methods.Assignment.School;

public class School {
	public static void main(String[] args) {

		Student studOne = new Student("anusha", 1001, 3, 63);
		studOne.printStudentInfo();
		studOne.printStudentInfo("Hello");
		System.out.println(studOne.getName());
		System.out.println(studOne.getRollNumber());

	}

}
