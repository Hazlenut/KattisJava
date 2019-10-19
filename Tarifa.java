import java.util.*;
public class Tarifa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] values = new int[n];
		for(int i = 0; i < n; i++) {
			values[i] = sc.nextInt();
		}
		int total = x;
		for(int i = 0; i < n; i++) {
			total -= values[i];
			total+= x;
		}
		System.out.println(total);
	}

}
