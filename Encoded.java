import java.util.*;
import java.math.*;
public class Encoded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		for(int i = 0; i < num; i++) {
			String line = sc.nextLine();
			int a = (int) Math.sqrt(line.length());
			char[][] array = new char[a][a];
			int q =0;
			
			for(int r = 0; r < a; r++) {
				for(int c = a-1; c >= 0; c--) {
					array[c][r] = line.charAt(q);
					q++;
				}
			}
			String x = "";
			for(int k = 0; k < array.length; k++) {
				for(int j = 0; j < array.length; j++) {
					x += array[k][j];
				}
			}
			System.out.println(x);
			x = "";
		}
	}
	

}
