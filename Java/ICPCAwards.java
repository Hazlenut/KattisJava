import java.util.ArrayList;
import java.util.Scanner;

public class ICPCAwards {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int unis = Integer.parseInt(s.nextLine());
		ArrayList<String> winners = new ArrayList<String>();
		int wins = 0;
		for(int i = 0; i < unis; i++) {
			if(wins >= 12) {
				break;
			}
			String input[] = s.nextLine().split(" ");
			if(!winners.contains(input[0])) {
				System.out.println(input[0] + " " + input[1]);
				winners.add(input[0]);
				wins++;
			}
		}
		s.close();
	}
	
}
