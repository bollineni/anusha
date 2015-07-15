package Statements;

public class NestedForLoop {

	public static void main(String[] args) {
     int i;
     int j;
    /* for(i=0;i<10;i++){
    	 System.out.println("\nouter loop is:"+i);
    	 for(j=0;j<1;j++){
    		 if(j==5)
    			 //continue;
    		 break;
    		 System.out.println("inner loop is:"+j);
    		 
    	 }
     }*/
     for(i=0;i<10;i++){
    	 if(i==8)
    		 break;
    	 System.out.println("\nouter loop is:"+i);
    	 for(j=0;j<1;j++){
    		 if(j==5)
    			 //continue;
    		 break;
    		 System.out.println("inner loop is:"+j);
     }
    	 System.out.println("\nthis is the end");
	}

}
}