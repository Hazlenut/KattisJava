import java.util.*;
public class ChickenPerPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		int a = Integer.parseInt(text.split(" ")[0]);
		int b = Integer.parseInt(text.split(" ")[1]);
		if(a-b == 1) {
			System.out.println("Dr. Chaz needs 1 more piece of chicken!");
		}else if (a-b == -1) {
			System.out.println("Dr. Chaz will have 1 piece of chicken left over!");
		}else 
		if(a-b < 0) {
			System.out.println("Dr. Chaz will have " + Math.abs(a-b) + " pieces of chicken left over!");
		}else{
			System.out.println("Dr. Chaz needs " + (a-b) + " more pieces of chicken!");
		}
	}

}
