package Absraction;


public class Rectangle extends Shape{

	public int width=20;
	public int length = 30;

	@Override
	public void area() {
		int a = length * width;
		System.out.println("area of Rectangle : " + a);
	}

	@Override
	public void perimeter() {
		int p = 2 * (length + width);
		System.out.println("Perimter of Rectangle : " + p);
	}
	
	public static void main(String[] args) {
		Rectangle obj = new Rectangle();
		obj.area();
		obj.perimeter();
	}

}
