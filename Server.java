import java.util.*;
public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int a = Integer.parseInt(line.split(" ")[0]);
		int b = Integer.parseInt(line.split(" ")[1]);
		int[] values = new int[a];
		String inputs = sc.nextLine();
		for(int i = 0; i < a; i++) {
			values[i] = Integer.parseInt(inputs.split(" ")[i]);
			
		}
		int total = 0;
		int c = 0;
		while(total + values[c] <= b) {
			total+=values[c];
			c++;
			if(c == a) {
				break;
			}
		}
		System.out.println(c);
	}

}
