package exercises;

public class MethodOverloadEx6 {

/* 13. Write Shape Class to find perimeter of below shapes using Method overloading
Shape perimeter Formula
Square 4 × side
Rectangle 2 × (length + width)
Triangle side1 + side2 + side3
Circle 2 × pi × radius */
	
	float r=5;
	public void perimeter(int side) {
		int p= 4 * side;
		System.out.println("Perimeter of Square 4*side: : " + p);
	}
	
	public int perimeter(int length, int width) {
		int p= 2 * (length * width);
		return p;
	}
	public void perimeter(float s1, float s2, float s3) {
	//	float p = s1+s2+s3;
		System.out.println("Perimeter of Triangle : " +(s1+s2+s3));
	}
	public void perimeter() {
		double p = 2*Math.PI * r;
		System.out.println("Perimeter of circle : " + p);
	}	
	
	public static void main(String[] args)  {
		MethodOverloadEx6 obj = new MethodOverloadEx6();
			obj.perimeter(7);
			int pr=obj.perimeter(13,7);
			System.out.println("Perimeter of rectangle :" + pr);
			obj.perimeter(25.75f,20.5f,21.75f);
			obj.perimeter();
}
}
