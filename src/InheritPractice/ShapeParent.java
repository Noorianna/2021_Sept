package InheritPractice;

public class ShapeParent {	
		
			public float radius;
			public int length;
			public int width;
				
					
			public void areaOfCircle() {
				double a = Math.PI * radius * radius;
				System.out.println("area of circle : " + a);
			}

			public void areaOfRectangle() {
				int a = length * width;
				System.out.println("area of rectnagle : " + a);
			}
			
			public static void main(String[] args) {
				
				ShapeParent obj = new ShapeParent();
				obj.radius = 14.6f;
				obj.length = 23;
				obj.width =25;
				obj.areaOfCircle();
				obj.areaOfRectangle();
				
			}

		}

	


