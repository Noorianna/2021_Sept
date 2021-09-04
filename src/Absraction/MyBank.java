package Absraction;

public class MyBank extends PayMeGateway {

	@Override
	public void processPayment(String cardNumber, String cvv) {
		
		System.out.println( "processed ");
		
	}
	
	public static void main(String[] args) {
		MyBank obj = new MyBank();
		obj.getUserData();
		obj.processPayment("899798", "999");
	}

}

//1.      Create an interface Shapes with volume as method. 
//Use this interface to implement in following classes with the given volume formula as below

//a.      Cube -  a^3( a = length of edge)

//b.      Rectangular Prism -  l * w * h (l= length, w = width, h = height)