import java.util.*;
public class Cetvrta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		String c = sc.nextLine();
		String[] valueA = new String[2];
		String[] valueB = new String[2];
		String[] valueC = new String[2];
		valueA = a.split(" ");
		valueB = b.split(" ");
		valueC = c.split(" ");
		int x = 0;
		int y = 0;
		if(valueA[0].equals(valueB[0])) {
			x = Integer.parseInt(valueC[0]);
		}else if(valueA[0].equals(valueC[0])) {
			x = Integer.parseInt(valueB[0]);
		}else{
			x = Integer.parseInt(valueA[0]);
		}
		if(valueA[1].equals(valueB[1])) {
			y = Integer.parseInt(valueC[1]);
		}else if(valueA[1].equals(valueC[1])) {
			y = Integer.parseInt(valueB[1]);
		}else{
			y = Integer.parseInt(valueA[1]);
		}
		System.out.println(x + " "  + y);
	}

}
