import java.util.*;

public class NastyHacks {
	public static String method(String line, int num) {
		String[] outputs = new String[num];
		String[] value = new String[3];
		value = line.split(" ");
		int[] values = new int[3];
		for (int k = 0; k < 3; k++) {
			values[k] = Integer.parseInt(value[k]);
		}
		if(values[0] + values[2] == values[1]) {
			return "does not matter";
		}else if(values[0] > values[1]) {
			return "do not advertise";
		}else if(values[0] + values[2] > values[1]) {
			return "do not advertise";
		}else{
			return "advertise";
		
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] outputs = new String[num];
		for (int i = 0; i < num; i++) {
			String line = sc.nextLine();
			outputs[i] = method(line, num);
			
			}
		for(int i = 0; i < num; i++) {
			System.out.println(outputs[i]);
		}
		}
	}
