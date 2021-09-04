package inheritanceDemo;

public class SuperChild extends SuperParent{
	
	public float radius;
	public int side;

	SuperChild(int l, int w, float radius) {
		super(l, w);
		this.radius = radius;
		//this(radius); cant have this here as it must be first statement
	}
	
	SuperChild(int l, int w) {
		super(l, w);
	}
	
	SuperChild(float r){
		super(0,0);
		radius = r;
	}
	
	//SuperChild(int s, float r){ not allowed here without calling parent class constructor
	//	side = s;
	//	radius = r;
	//}
	
	
	public void areaOfCircle() {
		double a = Math.PI * radius * radius;
		System.out.println("area of circle : " + a);
		super.areaofRectangle();
		super.length = 40;
		super.width = 50;
		
	}

	public static void main(String[] args) {
		SuperChild obj = new SuperChild(10, 20, 15.7f);
		obj.areaofRectangle();
		obj.areaOfCircle();
		
		SuperChild obj2 = new SuperChild(30, 40);
		obj2.areaofRectangle();
		obj2.areaOfCircle();

	}

}
