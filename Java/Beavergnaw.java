import java.util.*;
public class Beavergnaw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
		int D = sc.nextInt();
		int V = sc.nextInt();
		if(D == 0 && V == 0) {
			break;
		}
		double res = Math.cbrt((((Math.PI * Math.pow(D, 3)) - (6*V))/Math.PI));
		System.out.println(res);
	}
	}

}
