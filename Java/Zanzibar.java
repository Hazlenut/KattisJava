import java.util.*;
public class Zanzibar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int j = 0; j < num; j++) {
			int x;
			ArrayList<Integer> array = new ArrayList<Integer>();
			while((x = sc.nextInt()) != 0) {
				array.add(x);
			}
			int total = 0;
			for(int i = 0; i < array.size()-1; i++) {
				if(array.get(i) * 2 < array.get(i+1)) {
					total += array.get(i+1) - (array.get(i) * 2);
				}
			}
			System.out.println(total);
			array.clear();
			total = 0;
		}
	}


}
