import java.util.*;
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] line = new String[2];
		line = sc.nextLine().split(" ");
		String a = line[0];
		String b = line[1];
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		double deg = Math.toRadians(y);
		System.out.println((int)((x)/(Math.sin(deg))+1));
		
	}

}
