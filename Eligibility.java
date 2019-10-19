import java.util.*;

public class Eligibility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String[] array = new String[num];
		for (int i = 0; i < num; i++) {
			array[i] = method();
		}
		for (int i = 0; i < num; i++) {
			System.out.println(array[i]);
		}
	}

	public static String method() {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String[] inputs = new String[4];
		inputs = text.split(" ");
		if ((Integer.parseInt(inputs[1].split("/")[0])) >= 2010) {
			return inputs[0] + " " + "eligible";

		} else if ((Integer.parseInt(inputs[2].split("/")[0])) >= 1991) {
			return inputs[0] + " " + "eligible";

		} else {
			if (Integer.parseInt((inputs[3])) >= 40) {
				return inputs[0] + " " + "ineligible";
			} else {
				return inputs[0] + " " + "coach petition";
			}

		}

	}
}
