package Constructor_chaining;

public class Demo2 extends Demo1 {

	int roll;
	Demo2(int a, String n,int roll) {
		super(a, n);
		this.roll=roll;
		m1();
	}
	public void m1()
	{
			System.out.println("your roll is :"+roll);
	}
	
	
	
	
}
