package Abstract;

public class ComparableCircle extends Circle {
	
	public static int compareTo(Circle a, Circle b){
		if(a.getArea()>b.getArea()){
			return 1;
		}
		
		if(a.getArea()<b.getArea()){
			return -1;
		}
		
		return 0;
	}
}
