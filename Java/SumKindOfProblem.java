import java.util.*;
public class SumKindOfProblem {
	public static int getAll(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total+= i;
			
		}
		return total;
	}
	public static int getOdd(int n) {
		int total =0;
		int x = 0;
		int i = 0;
		while(x != n) {
			if(i%2 != 0) {
				total+= i;
				x++;
				//System.out.println("x " + x);
			}
			i++;
			//System.out.println("i " + i);
			
		}

		return total;
	}
	public static int getEven(int n) {
		int total = 0;
		int x = 0;
		int i = 1;
		while(x != n) {
			if(i%2==0) {
				
				total+=i;
				x++;
				//System.out.println("x " + x);
			}
			i++;
			//System.out.println("i " + i);
			//System.out.println(total);
		}
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String test = "";
		int[] outputs = new int[num];
		int[] outputs1 = new int[num];
		int[] outputs2 = new int[num];
		String[] lines = new String[2];
		for(int i = 0; i < num; i++) {
			test = sc.nextLine();
			lines = test.split(" ");
			//System.out.println(lines[1]);
			outputs[i] = getAll(Integer.parseInt(lines[1]));
			outputs1[i] = getOdd(Integer.parseInt(lines[1]));
			outputs2[i] = getEven(Integer.parseInt(lines[1]));
		}
		for(int i = 1; i <= num; i++) {
			System.out.println(i + " " + outputs[i-1] + " " + outputs1[i-1] + " " + outputs2[i-1]);
		}
	}

}
