package Absraction;

public class MyCard extends PayMeGateway{

	@Override
	public void processPayment(String cardNumber, String cvv) {
		System.out.println("processsed");
		
	}

	public static void main(String[] args) {
		MyCard obj = new MyCard();
		System.out.println(obj.a);
		obj.a = 10;
		System.out.println(obj.a);
		obj.getUserData();
		obj.processPayment("899798", "999");
	}
}

