package Arrays;

public class TwoDimenArray {

	public static void main(String[] args) {
		int person1[] = { 5, 30 }; // height and age and percentage
		int person2[] = { 6, 32 }; // height and age
		int person3[] = { 7, 34 }; // height and age

		int persons[][] = { person1, person2, person3 };
		
		System.out.println(person1[0] + "  " + person1[1]);
		System.out.println(person3[0] + "  " + person3[1]);
		
		/*System.out.print(persons[2][0] + " ");
		System.out.print(persons[2][1] + " ");*/
		
		System.out.println(persons[0][0] + "  " + persons[0][1]);
		System.out.println(persons[1][0] + "  " + persons[1][1]);
		
		System.out.println(" persons.length "+persons.length);
		
		for(int i = 0 ; i < persons.length ; i++) {
			System.out.println(persons[i][0] + " " + persons[i][1]);
		}
		
		System.out.println("=======================");
		
		for(int i = 0 ; i < persons.length ; i++) {
			for(int  j = 0; j < persons[i].length ; j++) {
				System.out.print(persons[i][j] + "  " );
			}
		}
	}

	}


