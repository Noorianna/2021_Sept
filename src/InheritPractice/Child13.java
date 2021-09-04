package InheritPractice;

public class Child13 extends Parentbase{
	long s2=9;
	public void square() {
		//long asq=s2*s2;
		System.out.println("Area of square2: " +(s2*s2));
	}

	public static void main(String[] args) {
		Child13 obj= new Child13();
		obj.areaCircle();
		obj.square();
		

	}

}
