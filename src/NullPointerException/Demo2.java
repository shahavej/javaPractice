package NullPointerException;

public class Demo2 {

	
	public static void main(String[] args) {
		
			Demo1 a= new Demo1();
			Demo1 b = a.dance();
			
			System.out.println(b.name);
	}
}
