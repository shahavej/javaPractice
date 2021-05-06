package Scanner;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("please enter you name:");
		String name = sc.next();
		System.out.println("your name is : "+name);
	}
}
