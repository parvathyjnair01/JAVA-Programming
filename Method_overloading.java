package javaLab;
class shape  {
	public int area(int side) {
		System.out.println("Square");
		return side*side;
	}
	public int area(int l,int b) {
		System.out.println("Rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("circle");
		return 3.14f*radius*radius;
	}
		
}

public class Method_overloading {
	public static void main(String [] args) {
		shape shape=new shape();
		shape.area(10);
		shape.area(5,6);
		shape.area(3.14f*5*5);
		
               
	}
	

}
