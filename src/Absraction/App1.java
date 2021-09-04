package Absraction;

public class App1 implements HomePageInterface, CheckoutInterface{

	public void myMethod() {
		System.out.println(" In chid class method");
	}


	@Override
	public void launchBrowser() {
		System.out.println(" Launch firefox");
		
	}

	@Override
	public void login(String uname, String pwd) {
		System.out.println("Logging into app1");
		
	}

	@Override
	public void logout() {
		System.out.println("Log out of App1");
		
	}
	
	@Override
	public void checkOut() {
		System.out.println("In checkout");
		
	}
	
	public static void main(String[] args) {
		
		App1 obj = new App1();
		obj.launchBrowser();
		obj.login("guest", "guest");
		obj.checkOut();
		obj.logout();
		obj.myMethod();
		//obj.PI = 3.145f; //cant assign a value as it becomes constant
		
		
		HomePageInterface obj2 = new App1();
		obj2.launchBrowser();
		obj2.login("guest", "guest");
		//obj2.myMethod(); // cant access as datatype of object is interface
		//obj2.checkout() // cant access as checkout() belongs to different interface
		obj2.logout();
	}
}
