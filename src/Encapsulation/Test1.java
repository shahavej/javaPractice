package Encapsulation;

public class Test1 {
	//* this is the example of encapsulation
	
	 public static void main(String[] args) {
		Demo1 obj=new Demo1();
		obj.set_value("shahavej", 22);
		System.out.println(obj.get_name());
		System.out.println(obj.get_age());
	}
}
