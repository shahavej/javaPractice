package Constructor;

public class Demo1 {

		int a;
		int b;
		int c;
		
		Demo1(int a,int b)
		{
			this.a=a;
			this.b=b;
			this.c=a+b;
			System.out.println(c);
		}
		
		public static void main(String[] args) {
			Demo1 obj= new Demo1(8, 9);
		}
		
		
}


