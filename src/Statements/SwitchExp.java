package Statements;

public class SwitchExp {

	public static void main(String[] args) {
		int age = 20;
		String name = (age > 18) ? "Adult" : "child";
		long startTime = 0, endTime = 0;

		startTime = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			if (age == 18) {
				name = "18";
			} else if (age == 19) {
				name = "19";
			} else if (age == 20) {
				name = "20";
			} else if (age == 21) {
				name = "21";
			} else {
				name = "nothing";
			}

		}
		endTime = System.currentTimeMillis();

		System.out.println("If Else performance"+(endTime - startTime));

		//System.out.println(name);
		startTime = System.currentTimeMillis();
		
		for (int i = 0; i < 5000; i++) {
			switch (age) {
			case 18:
				name = "18";
				// System.out.println("age is 18");
				break;
			case 19:
				name = "19";
				// System.out.println("age is 19");
				break;
			case 20:
				name = "20";
				// System.out.println("age is 20");
				break;
			case 21:
				name = "21";
				// System.out.println("age is 21");
				break;

			default:
				System.out.println("no age");
				break;
			}

		}

		endTime = System.currentTimeMillis();
		System.out.println("Switch performance "+ (endTime - startTime));
	   
		/*int value=0;
		for(int i=0;i<10;i++){
			value++;
		}
		System.out.println(value);*/
	}

}
