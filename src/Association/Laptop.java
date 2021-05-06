package Association;

public class Laptop {
	/* this is the example of association */
	String brand;
	String color;
	int price;


	public void playsong()
	{
		System.out.println("this is the play song method of Laptop class");
	}

	Charger ch=new Charger();

}
