import java.util.*;
public class Trik {
	private static int[] thisArray = new int[3];
	public Trik(int[] thisArray) {
		this.thisArray = thisArray;
	}
	public static void alpha() {
		int temp = -1;
		temp = thisArray[0];
		thisArray[0] = thisArray[1];
		thisArray[1] = temp;
		
	}
	public static void beta() {
		int temp = -1;
		temp = thisArray[1];
		thisArray[1] = thisArray[2];
		thisArray[2] = temp;
		
	}
	public static void kappa() {
		int temp = -1;
		temp = thisArray[0];
		thisArray[0] = thisArray[2];
		thisArray[2] = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		thisArray[0] = 1;
		String line = sc.nextLine();
		for(int i = 0; i < line.length(); i++) {
			char x = line.charAt(i);
			if(x == 'A') {
				alpha();
			}
			if(x == 'B') {
				beta();
			}
			if(x == 'C') {
				kappa();
			}
		}
		for(int i = 0; i <3; i++) {
			if(thisArray[i] == 1) {
				System.out.println(i+1);
			}
		}
	}
	

}
