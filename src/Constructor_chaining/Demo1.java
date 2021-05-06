package Constructor_chaining;

public class Demo1 {

	int age;
	String name;
	
	Demo1(int a, String n)
	{
		this.age=a;
		this.name=n;
		m();
	}
	public void m()
	{
		System.out.println("your name is :"+name);
		System.out.println("your age is :"+age);
	}
	
}
