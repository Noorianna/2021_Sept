package inheritanceDemo;

public class SuperParent {
	
	public int length;
	public int width;
	
	// a constructor
	SuperParent(int l, int w){
		length = l;
		width = w;
	}
	
	public void areaofRectangle() {
		int a = length * width;
		System.out.println("Area of Rectangle : " + a);
	}
}
//Create an Abstract Shapes with area, Perimeter. Use this class to extend in Class Square, Triangle. Print area, perimeter from Square and Triangle classes.