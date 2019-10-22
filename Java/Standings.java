import java.util.*;
public class Standings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < n; i++) {
			sc.nextLine();
			int a = sc.nextInt();
			sc.nextLine();
			int[] array = new int[a];
			for(int j = 0; j < a; j++) {
				array[j] = Integer.parseInt(sc.nextLine().split(" ")[1]);
			}
			for(int m = 0; m < array.length; m++) {
				for(int o = m+1; o < array.length; o++) {
					if(array[o] < array[m]) {
						int temp = array[o];
						array[o] = array[m];
						array[m] = temp;
					}
				}
			}
			for(int u: array) {
				System.out.println("here " + u);
			}
			int total = 0;
			for(int k = 0; k < array.length; k++) {
				total+= (Math.abs(array[k] - (k+1)));
			}
			
			System.out.println(total);
		}
	}

}
