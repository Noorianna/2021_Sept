package exercises;

public class ChildDemo extends ParentDemo{
	 float radius=4.5f;
	public void perimeter() {
		double p = 2*Math.PI * radius;
		System.out.println("Perimeter of circle : " + p);
	}	
	public static void main(String[] args) {
		ChildDemo obj=new ChildDemo();
		obj.perimeter(7);
		obj.perimeter(9,9);
		obj.perimeter();
		obj.perimeter(3.5f, 5.5f, 6.7f);

	}

}
