package Abstract;
import java.util.Scanner;

public class Driver_circle {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter radius of first circle:");
		double r1 = input.nextDouble();
		
		System.out.print("Enter radius of second circle:");
		double r2 = input.nextDouble();
		
		Circle uno = new Circle(r1);
		Circle dos = new Circle(r2);
		
		System.out.println(ComparableCircle.compareTo(uno, dos));
	}
}
