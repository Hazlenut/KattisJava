import java.util.*;
import java.math.*;
public class Cannonball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int i = 0; i < cases; i++) {
			double v = sc.nextDouble();
			double d = sc.nextDouble();
			double x = sc.nextDouble();
			double h1 = sc.nextDouble();
			double h2 = sc.nextDouble();
			double t = (x/(v*Math.cos(Math.toRadians(d))));
			double h = v*t*Math.sin(Math.toRadians(d)) - (.5 * 9.81 * Math.pow(t, 2));
			if(h1+1 < h && h < h2-1) {
				System.out.println("Safe");
			}else{
				System.out.println("Not Safe");
			}
		}
	}

}
