package Constructor;

public class Demo2 {

	//* this is the example of constructor overloading 
	
	//* constructor overriding is not possible in java coz constructor is an non explicit return type spl method 


	Demo2(int a)
	{
		System.out.println(a);
	}

	Demo2(int a,int b)
	{
		System.out.println(a+b);
	}

	Demo2(String a, int b)
	{
		System.out.println(a);
		System.out.println(b);
	}

	Demo2(String  a)
	{
		System.out.println(a);
	}


	public static void main(String[] args) {

		Demo2 obj=new Demo2("Shahavej",1);
	}




}
