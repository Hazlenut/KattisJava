import java.util.*;
public class Coldputer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums = sc.nextInt();
		int total = 0;
		for(int i = 0; i < nums; i++) {
			int x = sc.nextInt();
			if(x < 0) {
				total++;
			}
		}
		System.out.println(total);
	}

}
