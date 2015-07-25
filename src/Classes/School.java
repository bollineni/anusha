package Classes;

     class Teacher{
    	 //State(instance variable) and behaviour(methods)
     }

public class School {
	public void callme(){
		System.out.println("I am a scholl");
	}

	public static void main(String[] args) {
		/*Student studOne = new Student();
		studOne.name = "anusha";
		studOne.grade = 3;

		Student studTwo = new Student();
		studTwo.name = "rajesh";
		studTwo.grade = 6;

		System.out.println(studOne.name);
		System.out.println(studTwo.name);
		
		studOne.name="anu";
		System.out.println(studOne.name);*/
		
		/*Student studThree=new Student( "anusha");
		studThree.grade=5;
		
		System.out.println(studThree.name);
		studThree.name="Baby";
		
		System.out.println(studThree.name);
		Student stud=studThree;
		stud.name="new name";
		System.out.println(studThree.name);
		System.out.println(stud.name);*/
		
		Student studOne=new Student("Anusha",300);
		studOne.printStudentInfo();
		//studOne.name="anusha";
		//studOne.printStudentInfoHello();
		studOne.printStudentInfo("Hello");
		
		//studOne.getInfo();
		//studOne.printStudentInfo("Bye");
       // System.out.println(studOne.name+" "+studOne.rollNumber);
		System.out.println(studOne.getName());
		System.out.println(studOne.getrollNumber());

	}

}
