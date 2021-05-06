package Polymorphism;

public class Demo3 extends Demo2 {

	
	public void m(int a, int b)
	{
		System.out.println("first parm: "+a);
		System.out.println("second parm: "+b);
	}
	
	public static void main(String[] args) {
		
		Demo3 obj=new Demo3();
		obj.m(1, 5);
	}
}
