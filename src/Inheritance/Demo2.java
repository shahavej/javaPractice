package Inheritance;

public class Demo2 extends Demo1 {

	int age;
	int section;
	
	public void m2(int a,int c)
	{
		System.out.println("method of class Demo2");
		System.out.println("student age is : "+a);
		System.out.println("student in class : "+c);
	}
	
	public static void main(String[] args) {
		
		Demo2 obj=new Demo2();
		String fname=obj.fathername="Hasan";
		String sname=obj.studentname="shahavej";
		obj.m(fname,sname);
		obj.m2(5, 2);
		
	}
	
}
