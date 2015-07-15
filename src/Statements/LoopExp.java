package Statements;

public class LoopExp {

	public static void main(String[] args) {
		String names[] = { "anusha", "rajesh", "anu", "baby", "bujjulu" };
		System.out.println("=======For=====");
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("====Enhanced For Loop====");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("=======While======");
		int idxwhile = 0;
		while (idxwhile < names.length) { // while loop checks boolean condition
			System.out.println(names[idxwhile++]);
		}
		System.out.println("======Do While=====");
		int idxDowhile = 0;
		do {

			System.out.println(names[idxDowhile++]);
		} while (idxDowhile < names.length);
             
		int folksIdx=0;
		/*for(;;){ //infinite loop
			
			System.out.println("Hello Folks " + folksIdx++);
			System.out.println("Hello Guys=====");
		}*/
		/*for(int i=0;i<10;i++){
			System.out.println("Hello Folks " + folksIdx++);
			System.out.println("Hello Guys=====");
		}*/
		while(true){
			System.out.println("Hello Folks " + folksIdx++);
			if(folksIdx==3000){
				break;
			}
		}
		System.out.println("Hello Guys=====");
	}
	
}