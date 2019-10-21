import java.util.*;
public class Touchdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 0;
		boolean touchdown = true;
		boolean safety = false;
		int down = 0;
		int initial = 0;
		int move = 0;
		boolean reset = true;
		for(int i = 0; i < n; i++) {
			int k = sc.nextInt();
			if(reset) {
				initial = k+move;
				reset = false;
			}
			total+=k;
			down++;
			//System.out.println("total " + total);
			//System.out.println("down " + down);
			//System.out.println(down + " down and " + (total-initial) + " yards");
			if(down == 4 && total-initial <= 20) {
				touchdown = false;
				//System.out.println("failed");
				break;
			}
			if(total-initial >= 20) {
				down = 1;
				move = initial;
				//System.out.println("reset");
				reset = true;
			}
			if(total <= -20) {
				touchdown = false;
				safety = true;
				break;
			}
			if(initial-20 <= total) {
				safety = true;
				break;
			}
			if(total >= 80) {
				break;
			}
		}
		if(touchdown) {
			System.out.println("Touchdown");
		}else {
			if(!safety) {
				System.out.println("Nothing");
			}else {
				System.out.println("Safety");
			}
			}
			
	}

}
