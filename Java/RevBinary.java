import java.util.*;
public class RevBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String binary = "";
		while(x>0) {
			binary += Integer.toString(x%2);
			x = x/2;
		}
	
		String rev = "";
		for(int i = 1; i <= binary.length(); i++) {
			rev += binary.charAt(binary.length() -i);
		}
		
		int total = 0;
		for(int i = binary.length()-1; i >=0; i--) {
			if(rev.charAt(i) == '1') {
			total+= Math.pow(2, i);
			}
		}
		System.out.println(total);
	}

}
