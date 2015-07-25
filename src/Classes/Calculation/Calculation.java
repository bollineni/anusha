package Classes.Calculation;

public class Calculation {

	public int add(int a, int b) {
		int val = (a + b);
		return val;
	}

	public float add(int a, int b, int c) {
		return (a + b + c);
	}

	public void doCalculation(int a, int b) {
		float finalvalue = 8 - add(a, b);
		System.out.println(finalvalue);
	}

	public void doCalculation(int a, int b, int c) {
		float finalvalue = 8 - add(a, b, c);
		System.out.println(finalvalue);
	}
}
