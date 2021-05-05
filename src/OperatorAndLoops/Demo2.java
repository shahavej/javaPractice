package OperatorAndLoops;

public class Demo2 {
//* this is the example of nested loops
	
	public static void main(String[] args) {
		
		for (int i = 5; i >= 0 ; i--) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
