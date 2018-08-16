package Abstract;

public class Triangle extends GeometricObject{
	//Three double  data fields named  side1, side2, and side3
	public double side1, side2, side3;
	//A default constructor  that creates a triangle with three sides of length 1.0
	public Triangle(){
		side1=1;
		side2=1;
		side3=1;
	}
	//A constructor  that creates a triangle with specified values  for side1, side2, and side3
	public Triangle(double a, double b, double c){
		side1=a;
		side2=b;
		side3=c;
	}
	//Accessor methods  for all three data fields
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	//A method  called getArea() that returns the area of a triangle
	public double getArea(){
		double s = (side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	//A method  named  getPerimeter() that returns the perimeter of the triangle

	public double getPerimeter() {
		return side1+side2+side3;
	}

}
