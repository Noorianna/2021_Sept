package oopConcepts;

public class MethodOverloadingDemo {
	
		
		float r = 12.75f;
		
		
		public void area() {
			double a = Math.PI * r * r;
			System.out.println("Area of circle : " + a);
		}
		
		public void area(int side) {
			int a = side * side;
			System.out.println("Area of Square : " + a);
		}
		
		public int area(int length, int width) {
			int a = length * width;
			return a;
		}
		
		public void area(float b, float h) {
			float a = (b * h)/2;
			System.out.println("Area of Triangle : " + a);
		}

		
		
		public static void main(String[] args) {
			MethodOverloadingDemo obj = new MethodOverloadingDemo();
			obj.area();
			obj.area(5);
			int ar = obj.area(10, 20);
			System.out.println("area of rectangle :" + ar);
			obj.area(25.75f, 20.5f);
		}

	}


