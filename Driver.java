package Abstract;


import java.util.Scanner;
public class Driver {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter side 1 of triangle:");
		double uno = input.nextDouble();
		System.out.print("Enter side 2 of triangle:");
		double dos = input.nextDouble();
		System.out.print("Enter side 3 of triangle:");
		double tres = input.nextDouble();
		
		System.out.print("Enter color of triangle:");
		String color = input.next();
		
		System.out.print("Enter whether triangle is filled (yes/no):");
		String yesNo = input.next();
		
		Triangle tri = new Triangle(uno,dos,tres);
		
		if(yesNo.equals("yes")){
			tri.setFilled(true);
		}else{
			tri.setFilled(false);
		}
		tri.setColor(color);
		System.out.println("Area: "+tri.getArea());
		System.out.println("Perimeter: "+tri.getPerimeter());
		System.out.println("Color: "+tri.getColor());
		System.out.println("Filled?: "+tri.isFilled());
	}
}
