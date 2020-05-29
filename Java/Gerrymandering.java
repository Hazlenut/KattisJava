import java.util.*;
public class Gerrymandering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] arrayA = new int[d];
		int[] arrayB = new int[d];
		double T = 0;
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			arrayA[d-x] += a;
			arrayB[d-x] += b;
			T += a;
			T += b;
		}
		boolean[] winner = new boolean[d];
		int[] arrayRA = new int[d];
		int[] arrayRB = new int[d];
		for(int i = 0; i < d; i++) {
			if(arrayA[i] > arrayB[i]) {
				winner[i] = true;
				arrayRA[i] = arrayA[i] - (((arrayA[i] + arrayB[i])/2)+1);
				arrayRB[i] = arrayB[i];
			}else {
				winner[i] = false;
				arrayRB[i] = arrayB[i] - (((arrayB[i] + arrayA[i])/2)+1);
				arrayRA[i] = arrayA[i];
			}
		}
		for(int i = d-1; i >= 0; i--) {
			if(winner[i]) {
				System.out.print("A " + arrayRA[i] + " " + arrayRB[i]);	
				System.out.println();
			}else {
				System.out.print("B " + arrayRA[i] + " " + arrayRB[i]);
				System.out.println();
			}
		}
		double total = 0;
		for(int i = d-1; i >= 0; i--) {
			total += arrayRA[i] - arrayRB[i];
		}
		total = Math.abs(total);
		System.out.println(total/T);
	}

}
