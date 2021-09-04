package inheritanceDemo;
public class ShapeChild1 extends ShapeBase{
	public void perimterCircle() {
		double p = 2 * Math.PI * radius;
		System.out.println("circle perimeter : " + p);
	}
	public static void main(String[] args) {
		ShapeChild1 obj = new ShapeChild1();
		obj.radius = 45.6f;
		obj.length = 40;
		obj.width = 50;
		obj.areaOfCircle();
		obj.areaOfRectangle();
		obj.perimterCircle();
	}

}
