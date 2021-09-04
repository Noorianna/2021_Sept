package Absraction;

public abstract class PayMeGateway {
	
	public int a = 6;
	
	public void getUserData() {
		System.out.println("Getting user deatils");
	}

	public abstract void processPayment(String cardNumber, String cvv);
	
}

