import java.util.*;

public class AlmostPerfect2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub

		while (sc.hasNextInt()) {

			int n = sc.nextInt();

			int res = almost(0, 1, n);
			if (res == n) {
				System.out.println(n + " perfect");
			} else if (n - 2 <= res && res <= n + 2) {
				System.out.println(n + " almost perfect");
			} else {
				System.out.println(n + " not perfect");
			}
		}
		sc.close();
	}

	public static int almost(int total, int num, int last) {
		if (num >= last / 2) {
			return num;
		} else if (last % num == 0) {
			return almost(total, num + 1, last) + num;
		} else {
			return almost(total, num + 1, last);
		}
	}

}
