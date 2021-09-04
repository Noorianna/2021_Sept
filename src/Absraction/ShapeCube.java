package Absraction;

public class ShapeCube implements ShapesInterface{
	
	@Override
	public void volume() {
		double a=5;
		double v=Math.pow(a, 3);
		System.out.println("cube volume: " +v);
	}
	
	public static void main(String[] args) {
		ShapeCube obj=new ShapeCube();
		obj.volume();
	}
}
