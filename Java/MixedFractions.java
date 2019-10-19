import java.util.*;
public class MixedFractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true){
			int a = sc.nextInt(), b=sc.nextInt();
			if(a == 0 && b == 0) {
				break;
			}
			int whole = a/b;
			int rem = a%b;
			System.out.println(whole + " " + rem + " / " + b);
		}
	}

}
