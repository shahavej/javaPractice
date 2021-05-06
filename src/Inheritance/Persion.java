package Inheritance;

public class Persion {
	//* this is the example of constructor chaining
	
	String name;
	int age;
	
	Persion(String name, int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("name of persion : "+name);
		System.out.println("age of persion: "+age);
	}

}
