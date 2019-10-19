import java.util.*;
public class Arrangements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<String> results = new ArrayList<String>();
		for(int i = 2; i < Math.round(num/2.0) + 1; i++) {
			for(int j = i-1; j < i+1; j++) {
				int total = 0;
				int round = 0;
				while(total < num) {
					if(round % 2 == 0) {
						total += i;
					}else{
						total += j;
					}
					round++;
					if(total == num) {
						results.add(i + "," + j);
						break;
					}
				}
			}
		}
		System.out.println(num + ":");
		for(String c: results) {
			System.out.println(c);
		}
	}

}
