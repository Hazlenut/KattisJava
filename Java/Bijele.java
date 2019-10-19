import java.util.*;
public class Bijele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] theSet = {1, 1, 2, 2, 2, 8};
		int[] theWrong = new int[6];
		for(int i = 0; i < 6; i++) {
			theWrong[i] = sc.nextInt();
		}
		for(int i = 0; i < 6; i++) {
			System.out.print(theSet[i] - theWrong[i] + " ");
		}
	}

}
