package inheritanceDemo;

public class OverrideSub extends OverrideParent
{
	
		@Override
		public void login(String uname, String password) {
			// different code goes here
			System.out.println("login successful in child class");
		}
		
		public static void myStat() {
			System.out.println("In child static");
		}
		
		//public static void insMethod() { // not allowed
		
		//}
		
		//public  void statmethod() { // not allowed
			
		//}

		public static void main(String[] args) {
			OverrideSub obj = new OverrideSub();// override
			obj.login("admin", "password");

			OverrideParent o2 = new OverrideParent();
			o2.login("test", "test");
			
			myStat();// static method cant override, process is called Hiding
			OverrideParent.myStat();
			
		}

	}
