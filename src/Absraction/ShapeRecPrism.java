package Absraction;

public class ShapeRecPrism implements ShapesInterface{
	// Rectangular Prism -  l * w * h (l= length, w = width, h = height)
	@Override
	public void volume() {
		float l=4.5f;
		float w=6.9f;
		float h=7.9f;
		System.out.println("Rectangular Prism Volume: " +(l*w*h));
	}
	
	public static void main(String[] args) {
		ShapeRecPrism obj=new ShapeRecPrism();
		obj.volume();
	}
}
