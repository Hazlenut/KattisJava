import java.util.*;
public class BabyBites {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = new int[num];
		sc.nextLine();
		String text = sc.nextLine();
		String[] inputs = new String[num];
		inputs = text.split(" ");
		ArrayList<Integer> indexes = new ArrayList<Integer>();
		for(int i = 0; i < num; i++) {
			if(inputs[i].equals("mumble")) {
				indexes.add(i);
			}
		}
		boolean result = true;
		for(int i = 0; i < num; i++) {
			if(array[i] != indexes.get(i)) {
				result = false;
			}
		}
		if(result) {
			System.out.println("makes sense");
		}else{
			System.out.println("something is fishy");
		}
	}

}
