import java.util.*;
public class DiceCup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] value = new String[2];
		int[] value1 = new int[2];
		value = line.split(" ");
		for(int i = 0; i < 2; i++) {
			value1[i] = Integer.parseInt(value[i]);
			
		}
		int high = value1[0] + value1[1];
		ArrayList<Integer> possible = new ArrayList<Integer>();
		for(int i = 0; i < high; i++) {
			possible.add(0);
		}
		int index = 0;
		for(int i = 0; i < value1[0]; i++) {
			for(int j = 0; j < value1[1]; j++) {
				possible.set(i+j, possible.get(i+j) + 1);
			}
			
		}
		int high1 = 0;
		int indexh = 0;
		for(int i = 0; i < possible.size(); i++) {
			if(possible.get(i) > high1) {
				high1 = possible.get(i);
				indexh = i;
			}
		}
		ArrayList<Integer> outputs = new ArrayList<Integer>();
		for(int i = 0; i < possible.size(); i++) {
			if(possible.get(i) == high1) {
				outputs.add(possible.get(i));
			}
		}
		for(int i = 0; i < outputs.size(); i++) {
			System.out.println(outputs.get(i));
		}
	}

}
