package Inheritance;

public class Employee extends Persion {
	//* this is the example of constructor chaining & this(); and super(); keyword 
	
	
	int empid;
	Employee(String name, int age,int empid) {
		super(name, age);
		this.empid=empid;
		System.out.println("employee id : "+empid);
	}
	
	public static void main(String[] args) {
		
		Employee e=new Employee("shahavej",25, 001);
		
	}



}
