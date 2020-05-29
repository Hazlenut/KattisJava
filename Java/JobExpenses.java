import java.util.*;
public class JobExpenses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		int total = 0;
		for(int i: array) {
			if(i<0) {
				total+=Math.abs(i);
			}
		}
		System.out.println(total);
	}

}
