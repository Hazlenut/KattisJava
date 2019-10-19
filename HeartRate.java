import java.util.*;
public class HeartRate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			double b = sc.nextDouble();
			double p = sc.nextDouble();
			double val = 60*b/p;
			double change = 60/p;
			System.out.println(val -change + " " + val +  " " + (val+change));
		}
	}

}
