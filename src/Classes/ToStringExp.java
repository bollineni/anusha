package Classes;

public class ToStringExp {

	public static void main(String[] args) {
		// Student stud=new Student("anusha",100);
		// System.out.println(stud);

		ToStringExp tse = new ToStringExp();
		String finalValue = "Hello " + tse.getName("anusha") + "****";
		System.out.println(finalValue);
	}

	public String getName(String firstName) {
		return firstName + "*****";
	}

}
