package oopConcepts;

public class ConstructorDemo {
		 
	 int length;
	 int width;
	 float radius;
	 
	 public ConstructorDemo() {
	  System.out.println("in default constructor");
	 }
	 
	 public ConstructorDemo(int l, int w, float r) {
	  length = l;
	  width = w;
	  radius = r;
	 }
	 
	 public ConstructorDemo(int l, int w) {
	  length = l;
	  width = w;
	 }
	 
	 public ConstructorDemo(float r) {
	  radius = r;
	 }
	 
	 public void areaOfCircle() {
	  double a = Math.PI * radius * radius;
	  System.out.println("area of circle : " + a);
	 }

	 public void areaOfrectangle() {
	  int a = length * width;
	  System.out.println("area of rectangle : " + a);
	 }
	 
	 public static void main(String[] args) {
	  ConstructorDemo obj = new ConstructorDemo(10, 20, 17.50f);
	  System.out.println(obj.length);
	  System.out.println(obj.width);
	  System.out.println(obj.radius);
	  obj.areaOfCircle();
	  obj.areaOfrectangle();
	  System.out.println("----------------------------");
	  ConstructorDemo obj2 = new ConstructorDemo(20, 30, 50.75f);
	  System.out.println(obj2.length);
	  System.out.println(obj2.width);
	  System.out.println(obj2.radius);
	  obj2.areaOfCircle();
	  obj2.areaOfrectangle();
	  System.out.println("----------------------------");
	  ConstructorDemo obj3 = new ConstructorDemo();
	  System.out.println(obj3.length);
	  System.out.println(obj3.width);
	  System.out.println(obj3.radius);
	  obj3.areaOfCircle();
	  obj3.areaOfrectangle();
	  System.out.println("----------------------------");
	  ConstructorDemo obj4 = new ConstructorDemo(15, 25);
	  System.out.println(obj4.length);
	  System.out.println(obj4.width);
	  System.out.println(obj4.radius);
	  obj4.areaOfCircle();
	  obj4.areaOfrectangle();
	  System.out.println("----------------------------");
	  ConstructorDemo obj5 = new ConstructorDemo(45.75f);
	  System.out.println(obj5.length);
	  System.out.println(obj5.width);
	  System.out.println(obj5.radius);
	  obj5.areaOfCircle();
	  obj5.areaOfrectangle();
	 }

	}


	
