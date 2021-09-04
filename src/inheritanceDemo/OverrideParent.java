package inheritanceDemo;

public class OverrideParent {
		
		public void login(String user, String pwd) {
			// code goes here
			System.out.println("login successful in parent class");
			
		}
		
		public static void myStat() {
			System.out.println("In parent static");
		}
		
		public void insMethod() {
			System.out.println("in parent instance method");
		}
		
		public static void statmethod() {
			System.out.println("in parent static method");
		}
		
		public static void main(String[] args) {

		}

		
	}