package InheritPractice;

public class ShapeChild1 extends ShapeParent {
	int s=5;
public void	areaofSquare(){
	
	System.out.println("Area of Square:" +(s*s));
		
	}
public static void main(String[] args) {
	ShapeChild1 obj=new ShapeChild1();
	obj.radius=40.58f;
	obj.length=28;
	obj.width=34;
	obj.areaOfCircle();
	obj.areaOfRectangle();
//	obj.s=9;
	obj.areaofSquare();
}
}
