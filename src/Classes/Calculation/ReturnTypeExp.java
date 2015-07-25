package Classes.Calculation;

public class ReturnTypeExp {
	
	
	public static void main(String[] args) {
		ReturnTypeExp rte = new ReturnTypeExp();
		
		Calculation calc=new Calculation();
		calc.doCalculation(4,5);
		calc.doCalculation(4,5,6);
		
		/*rte.doCalculation(4, 5);
		rte.doCalculation(4, 5, 6);
		String dou = rte.add(4, 6) + "";*/
       
		/*System.out.println("Hello" );
        String name=rte.getName("anusha","rajesh");*/
        
        System.out.println("Hello "+ rte.getName(" anusha","rajesh")+ " How you doing");
      // System.out.println("How you doing..");
		
        /* rte.add(2, 3); 
          //int finalvalue=8-5; int finalvalue=8-rte.add(2, 3);
		  System.out.println(finalvalue);*/
	}

	/*
	 * public void add(int a,int b){ System.out.println((a+b)); }
	 */
	public String getName(String firstName, String lastName) {
		//System.out.println(firstName+ "***" + lastName);
		return firstName + " *** " + lastName;
		
	}

}
