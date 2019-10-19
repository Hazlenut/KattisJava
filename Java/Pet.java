import java.util.*;
public class Pet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] lines = new String[5];
		for(int i = 0; i < 5; i++) {
			lines[i] = sc.nextLine();
		}
		int[] totals = new int[5];
		int[] here = new int[5];
		String[] values1 = new String[4];
		int[] values = new int[4];
		int total = 0;
		int x = 0;
		for(int j = 0; j < 5; j++) {
		for(int i = 0; i < 4; i++) {
			
			values1 = lines[j].split(" ");
		
			values[i] = Integer.parseInt(values1[i]);
			
			
		}
		total = 0;
		total += values[0] + values[1] + values[2] + values[3];
		
		totals[j] = total;
		here[j] = j;
		}
		int high = totals[0];
		int index = 0;
		for(int i = 1; i < 5; i++) {
			if(totals[i] >= high) {
				high = totals[i];
				index = i+1;
				
			}
			
		
	}
		System.out.println(here[index] + " " + high);
	}

}
