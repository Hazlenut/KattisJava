import java.util.*;
public class Beehind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<String> res = new ArrayList<String>();
		//int i  = 0;
		String line = "";
		while(!line.equals("0 0")) {
			line = sc.nextLine();
			int a = Integer.parseInt(line.split(" ")[0]);
			int b = Integer.parseInt(line.split(" ")[1]);
			if(line.equals("0 0")) {
				break;
			}
			if(a+b==13) {
			//	System.out.println(i);
				res.add("Never speak again.");
			}else if(a > b) {
			//	System.out.println(i);
				res.add("To the convention.");
			}else if(b > a) {
			//	System.out.println(i);
				res.add("Left beehind.");
			}else{
			//	System.out.println(i);
				res.add("Undecided.");
			}
			//i++;
		}
		for(String a: res) {
			System.out.println(a);
		}
	}

}
