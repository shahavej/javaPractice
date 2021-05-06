package Polymorphism;

public class Demo1 {
	//* this is the example of method overloading called as compile time polymorphism 

	public void m()
	{
		System.out.println("this is the non parameterised method");
	}

	public void m(String a)
	{
		System.out.println(a);
	}

	public void m(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
}
