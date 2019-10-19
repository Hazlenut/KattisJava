import java.util.*;
public class Zamka {
	public static int getDigitsTotal(int a) {
		int total =0;
		while (a > 0) {
			total += a%10;
			a = a /10;
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[3];
		for(int i = 0; i < 3; i++) {
			inputs[i] = sc.nextInt();
		}
		int x = 0;
		for(int i = inputs[0]; i <= inputs[1]; i++) {
			if(getDigitsTotal(i) == inputs[2]) {
				x = i;
			}
		}
		int y = 0;
		for(int i = inputs[1]; i >= inputs[0]; i--) {
			if(getDigitsTotal(i) == inputs[2]) {
				y = i;
			}
		}
		System.out.println(y);
		System.out.println(x);
	}

}
