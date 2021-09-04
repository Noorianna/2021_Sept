package exercises;

import oopConcepts.GrandParentDemo;

public class ParentDemo extends GrandParentDemo{
	int length;
	 int width;
	
	public void perimeter(int side) {
		
		int p= 4 * side;
		System.out.println("Perimeter of Square 4*side: : " + p);
		}
	public int perimeter(int length, int width) {
		int p= 2 * (length * width);
		return p;
	}
	public static void main(String[] args) {
		ParentDemo obj=new ParentDemo();
		obj.perimeter(7.5f, 8.6f,9.1f);   
		obj.perimeter(4);
		int pr=obj.perimeter(13,7);
		System.out.println("Perimeter of rectangle :" + pr);
	}

}
