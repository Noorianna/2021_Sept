package Absraction;

public class Circle extends Shape {

	public float radius = 17.5f;

	@Override
	public void area() {
		double a = Math.PI * radius * radius;
		System.out.println("Area of Circle : " + a);
	}

	@Override
	public void perimeter() {
		double p = 2 * Math.PI * radius ;
		System.out.println("Perimeter of Circle : " + p);
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.area();
		obj.perimeter();

	}

}

