import java.util.*;
public class Autori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int total = 0;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == '-') {
				total++;
			}
		}
		String[] test = new String[total+1];
		test = line.split("-");
		String answer = "";
		for(int i = 0; i < test.length; i++) {
			answer += test[i].charAt(0);
		}
		System.out.println(answer);
	}

}
