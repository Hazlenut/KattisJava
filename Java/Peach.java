import java.util.*;
public class Peach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num = Integer.parseInt(line.split(" ")[0]);
		int rounds = Integer.parseInt(line.split(" ")[1]);
		Set<Integer> removes = new HashSet<Integer>();
		for(int i = 0; i < rounds; i++) {
			removes.add(sc.nextInt());
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < num; i++) {
			if(!removes.contains(i)) {
				System.out.println(removes);
			}
		}
		System.out.println("Mario got " + rounds + " of the dangerous obstacles.");
	}

}
