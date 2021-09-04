package inheritanceDemo;

public class ChildPerimeter extends ParentPerimeter {

	public void squarePerimter(int side) {
		int v = 4 * side;
		System.out.println("Square Perimter : " + v);
	}
	
	@Override
	public void circlePerimeter(float radius) {
		double v = 2 * Math.PI * radius;
		System.out.println("Perimeter of Circle child : " + v);
	}
	
	public static void main(String[] args) {
		ChildPerimeter obj = new ChildPerimeter();
		obj.rectanglePerimter(4, 5);
		obj.squarePerimter(7);
		//Always by default preference is given to Local methods unless specifically called as below
		// to access the behaviour of the parent we create an object of child class but of datatype parent
		ParentPerimeter obj2 = new ChildPerimeter(); //Runtime polymorphism
		obj2.rectanglePerimter(10, 20);
		//obj2.squareVolume(9);
		obj2.circlePerimeter(7.5f);

	}

}
