import java.util.*;
public class PizzaCrust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		double ar = Math.pow(r, 2) * Math.PI;
		double ac =(Math.pow(r-c, 2) * Math.PI);
		System.out.println(ac/ar * 100);

	}
}

