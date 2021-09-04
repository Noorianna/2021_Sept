package InheritPractice;

public class Parentbase {
 float rad=4.5f;
 int width=6;
 int len=9;
 public void areaCircle(){
	 double a=Math.PI*rad;
	 
	 System.out.println("Area of Circle:" +a);
 }
 public void areaSquare() {
	 long s=len*len;
	 System.out.println("Area of Square:" +s);
 }
	public static void main(String[] args) {
		Parentbase obj=new Parentbase();
		obj.areaCircle();
		obj.len=7;
		obj.areaSquare();
	}

}
