import java.util.*;
public class Sok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String line2 = sc.nextLine();
		int[] first = new int[3];
		int[] second = new int[3];
		for(int i = 0; i < 3; i++) {
			first[i] = Integer.parseInt(line.split(" ")[i]);
			second[i] = Integer.parseInt(line2.split(" ")[i]);
		}
		double[] array = new double[3];
		for(int i = 0; i < 3; i++) {
			array[i] = ((double)first[i])/second[i];
			
		}
		System.out.println(0);
		for(int i = 1; i < 3; i++) {
			if(second[i] == second[0]) {
				System.out.println(0);
			}else{
			System.out.println(first[i] - array[i]);
		}
		}
	}

}
