package oopConcepts;

public class GrandParentDemo {
	
	
	 public void perimeter(float s1, float s2, float s3) {
			//	float p = s1+s2+s3;
				System.out.println("Perimeter of Triangle : " +(s1+s2+s3));
			}
	
	public static void main(String[] args) {
		GrandParentDemo obj=new GrandParentDemo();
		      obj.perimeter(4.5f, 3.5f, 6.5f);
			
	}

}
