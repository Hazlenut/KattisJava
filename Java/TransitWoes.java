import java.util.*;
public class TransitWoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();
		int end = sc.nextInt();
		int n = sc.nextInt();
		int[] one = new int[n+1];
		int[] two = new int[n];
		int[] three = new int[n];
		for(int i = 0;i < n+1; i++) {
			one[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			two[i] = sc.nextInt();
		}
		for(int i = 0; i < n; i++) {
			three[i] = sc.nextInt();
		}
		start+=one[0];
		for(int i = 0; i < n; i++) {
			loop:
			while(true) {
				for(int j = 0; j < three.length; j++) {
					if(start %three[j] == 0) {
						start+=two[i];
						break loop;
					}
				}
				start++;
			}

				start+=one[i];
				
		}
		if(start > end) {
			System.out.println("no");
		}else {
			System.out.println("yes");
		}
	}

}
