package exception;

public class excersice1 {

	public static void main(String[] args) {
		tryCatch();

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
}