package Encapsulation;

public class Demo1 {
	//* this is the example of encapsulation

	private String name;
	private int age;

	public void set_value(String name, int age )
	{
		this.name=name;
		this.age=age;
	}

	public String  get_name()
	{
		return name;
	}
	public int  get_age()
	{
		return age;
	}
}
