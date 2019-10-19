import java.util.*;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i = 0; i < 4; i++) {
			array.add(sc.nextInt());
		}
		Collections.sort(array);
		int a = Math.min(array.get(0),array.get(1));

		int b = Math.min(array.get(2),array.get(3));
		
		System.out.println(a*b);
	}
	

}
