import java.util.*;

public class AliceDigital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			int dig = Integer.parseInt(s.split(" ")[0]);
			int min = Integer.parseInt(s.split(" ")[1]);
			String line = sc.nextLine();
			int[] array = new int[dig];
			for (int j = 0; j < dig; j++) {
				array[j] = Integer.parseInt(line.split(" ")[j]);
			}			
			boolean change = false;
			int high = 0;
			int total = 0;
			for (int k = 0; k < array.length; k++) {

				if (change && array[k] == min) {
					if(total > high) {
						high = total;
					}
					total = 0;
					continue;

				}
				total += array[k];
				if (array[k] == min) {
					change = true;
				}
				if (array[k] == array[array.length - 1]) {
					if(total > high) {
						high = total;
					}
				}

			}
			System.out.println(high);

		}
	}

}
