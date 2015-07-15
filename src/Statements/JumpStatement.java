package Statements;

public class JumpStatement {

	public static void main(String[] args) {
  /*    for(int i=0;i<10;i++){
    	  System.out.print(i+" ");
    	  if(i%2==0)
    	  continue;
    	  System.out.println("");
      }*/
		for(int i=0;i<10;i++){
			if(i==7)
				//continue;
				break;
			System.out.print(i);
		}
		System.out.println("\nI am done...");
	}

}
