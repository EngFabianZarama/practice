package Abstract;
import java.lang.*;
public class preactice {
	public static boolean isSorted(Comparable[] a, boolean b){
		if(b==true){
			for(int i=0;i<a.length;i++){
				if(a[i].compareTo(a[i+1])>0){
					return true;	
		
				}
			}
		}else if(b==false){
			for(int i=0;i<a.length;i++){
				if(a[i].compareTo(a[i+1])<0){
					return true;	
				}
			}
			
		}
			return false;
		

		
	}
	
	public static void main(String[] args){
		
		Comparable[] x = {1,2,3,4};
		Comparable m;
		java.util.Arrays.sort(x);
		
		if(x.length%2==1){
			m = x[x.length/2];
		}else{
			m = x[(x.length/2)];	
		}
		
		System.out.print(m);
	}
}
