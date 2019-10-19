import java.util.*;
public class Everywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		ArrayList<String> places = new ArrayList<String>();
		Set<String> places1 = new HashSet<String>();
		for(int i = 0; i < cases; i++) {
			places.clear();
			places1.clear();
			int x = sc.nextInt();
			sc.nextLine();
			for(int j = 0; j < x; j++) {
				places.add(sc.nextLine());
				
			}
			places1.addAll(places);
			places.clear();
			places.addAll(places1);
			for(int k = 0; k < places.size(); k++) {
				System.out.println(places.get(k));
			}
			System.out.println(places.size());
			
			
		}
		
	}

}
