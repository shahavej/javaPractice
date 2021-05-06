package Association;

public class Test {
	/* this is the example of association */
	public static void main(String[] args) {
		
			Laptop l=new Laptop();
			l.ch.charger_color="black";
			l.ch.charger_price=100;
			l.brand="HP";
			l.color="blue";
			l.price=500;
			l.ch.charging();
			l.playsong();
	}
}
