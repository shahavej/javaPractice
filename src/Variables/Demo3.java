package Variables;

public class Demo3 {

	//* this is example of instance data member
	
	
	int a;  // Instance  data member declaration
	int b;	// Instance  data member declaration 

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		 obj.a=5;
		 obj.b=9;
		System.out.println(obj.a+obj.b);
		int result = obj.sub();
		System.out.println(result);
	}
	public int sub()
	{
		Demo3 obj = new Demo3();
		obj.a=8;
		obj.b=5;
		
		return obj.a-obj.b;
	}
}
