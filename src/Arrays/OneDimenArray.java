package Arrays;
//this particular example deals with 2d and 1d.
public class OneDimenArray { // ctrl+shift+f is formate

	public static void main(String[] args) {
		int age1 = 10;
		int age2 = 20;
		int age3 = 30;
		
		int ages[] = new int[3]; // {10,20,30};
		ages[0] = age1;
		ages[1] = age2;
		ages[2] = age3;

		// ages[3] = 40;

		System.out.println(" Length is " + ages.length);

		System.out.println(ages[0] + " ");
		System.out.println(ages[1] + " ");
		System.out.println(ages[2] + " ");

		// System.out.println(ages[3] + " ");

		// String names[] = {"anusha", "rajesh", "anu"};
		// System.out.println(names[0]);

		System.out.println("\n=============");

		for (int i = 0; i < ages.length; i++) {
			System.out.println(ages[i] + " ");
		}

		String names[] = { "one", "two", "three" };
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		// Enhanced for loop. For each
		for(String name : names) {
			System.out.println(name);
		}
		
		for(int age : ages) {
			System.out.println(age);
		}
		
	}
	

	}


