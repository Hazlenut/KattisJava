import java.util.*;
public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gunnar = sc.nextLine();
		String emma = sc.nextLine();
		int total = 0;
		for(int i = 0; i < 4; i++) {
			total += (Integer.parseInt(gunnar.split(" ")[i]) - Integer.parseInt(emma.split(" ")[i]));
		
		}
		if(total > 0) {
			System.out.println("Gunnar");
		}else if(total < 0) {
			System.out.println("Emma");
		}else{
			System.out.println("Tie");
		}
	}

}
