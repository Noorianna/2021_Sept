package exception;

public class UsingTryCatch {

	public static void main(String[] args) {

		//tryCatch();
		mulipletryCatch();
	}
	
	public static void tryCatch() {
		int i = 20;
		int j =0;
		try {
			int res = i /j;
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("caught exception, ignoring");
		}
		String names[] = {"John", "Linda", "Lisa", "Steve", "Larry"};
		try {
			System.out.println(names[0]);
			System.out.println(names[4]);
			System.out.println(names[6]);
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.getMessage();
			e.printStackTrace();
		}
		System.out.println("After AIOB exception");
	}
	
	public static void mulipletryCatch() {
		int i = 20;
		int j =4;
		try {
			int res = i /j;
			System.out.println(res);
			String names[] = {"John", "Linda", "Lisa", "Steve", "Larry"};
			System.out.println(names[0]);
			System.out.println(names[4]);
			System.out.println(names[6]);
		 // Multiple Catches
//		} catch(ArithmeticException e) {
//			System.out.println("Caught " + e.getMessage());
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("Caught " + e.getMessage());
//		}
		 // catch with Parent exception class
//		} catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
		// using super parentException
		} catch(Exception e) {
			
		}
		System.out.println("After AIOB exception");
	}

}