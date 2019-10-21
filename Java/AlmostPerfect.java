import java.util.*;
public class AlmostPerfect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			int n = sc.nextInt();
			int total = 0;
			for(int i = 2; i < total/2; i++) {
				if(n % i == 0) {
					n = n/2;
					total+=n;
					i=2;
				}
			}
			if(total==n) {
				System.out.println("perfect");
			}else if(total + 2 <= n || total -2 >= n) {
				System.out.println("almost perfect");
			}else {
				System.out.println("not perfect");
			}
		}
	}

}
