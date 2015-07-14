package Datatypes;
public class IntegerDatatypes2 {

	public static void main(String[] args) {
		int myage=Integer.parseInt("24");
		int urage=Integer.parseInt("31");
		byte totalage=(byte) (myage+urage);
		int height=myage;
		byte myHeight=(byte) height;
		System.out.println(totalage);
		  System.out.println(totalage + "total age");
		  System.out.println(myage+urage +" ===== total age");
          //System.out.println(" ===== total age " + myage+urage);
          System.out.println(" ===== total age " + (myage+urage));
	}

}