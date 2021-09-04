package inheritanceDemo;

public class ParentPerimeter {
	
	public void rectanglePerimter(int length, int width) {	
		int v = 2 * (length + width);
		System.out.println("Perimter of rectangle : "+ v);
	}
	
	public void circlePerimeter(float radius) {
		double v = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle parent: " + v);
	}

}
