import java.util.*;
public class OddManOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	/*	for(int i = 0; i < num; i++) {
			System.out.println("here");
			int n = sc.nextInt();*/
			for(int j = 0; j < num; j++) {
				int n = sc.nextInt();
				int[] array = new int[n];
				for(int k = 0; k < n; k++) {
					array[k] = sc.nextInt();
				}
				loop:
				for(int m = 0; m < n;m++) {
					int dup =0;
					for(int b = 0; b < n; b++) {
						if(array[m] == array[b]) {
							dup++;
						}
					}
					if(dup == 1) {
						System.out.println("Case #" + (j+1) + ": " + array[m]);
						break loop;
					}
				}
			}
		//}
	}

}
