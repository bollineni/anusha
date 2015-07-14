package Arrays;

public class TwoDArrayAssignment {

	public static void main(String[] args) {
       
		int person1[]={5,30}; //height and age
		int person2[]={6,32};
		int person3[]={7,34};
		
		int persons[][]={ person1, person2, person3};
		
		System.out.println( person1[0]+" "+ person1[1]);
		System.out.println( person2[0]+" "+ person2[1]);
		System.out.println( person3[0]+" "+ person3[1]);
		
		System.out.println("-------------");
		   
		   System.out.println(persons[0][0]+" "+persons[0][1]);
		   System.out.println(persons[1][0]+" "+persons[1][1]);
		   System.out.println(persons[2][0]+" "+persons[2][1]);
		   
		   System.out.println("-------------");
		   
		     System.out.println("persons.length "+persons.length);
		     
		     for(int i=0;i <persons.length;i++){
		    	 System.out.println(persons[i][0]+" "+persons[i][1]);
		     }
		     System.out.println("=============");
		     
		      for(int i=0;i<persons.length;i++){
		    	  for(int j=0;j<persons[i].length;j++)
		    		  System.out.println(persons[i][j]+" ");
		    	  System.out.println();
		      }
		      System.out.println("------------");
		      //Enhanced for loop for a 2DArray
		      
		      for(int[] x:persons){
		    	  for(int y:x){
		    		  System.out.println(y+"\t");
		      }
		    	 
		    	  System.out.println();
		      }
	}
      
		
	}

	
