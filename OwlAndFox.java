import java.util.*;
public class OwlAndFox {
	public static int calc(int x) {
		int n = 0;
		int xize = sum(x);
		for(int i = x; i >= 0; i--) {
			if(sum(i) == xize-1) {
				n = i;
				break;
			}
		}
		
		return n;
	}
	public static int sum(int x) {
		int total = 0;
		while(x > 0) {
			total+= x % 10;
			x = x/10;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			int x = sc.nextInt();
			System.out.println(calc(x));
		}
	}

}
