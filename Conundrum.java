import java.util.*;
public class Conundrum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String pers = "";
		for(int i = 0; i < line.length()/3; i++) {
			pers += "PER";
			
		}
		int total = 0;
		for(int i = 0; i < line.length(); i++) {
			if(i%3 == 0) {
				if(!(line.charAt(i) == 'P')) {
					line.replace(line.charAt(i), 'P');
					total++;
				}
			}else if(i%3 == 1) {
				if(!(line.charAt(i) == 'E')) {
					line.replace(line.charAt(i), 'E');
					total++;
				}
			}else{
				if(!(line.charAt(i) == 'R')) {
					line.replace(line.charAt(i), 'R');
					total++;
				}
			}
		}
		System.out.println(total);
	}
}








/*import java.util.*;
public class Conundrum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.toUpperCase();
		int length = line.length();
		int perNum = length/3;
		String thePers = "";
		for(int i = 0; i < perNum; i++) {
			thePers += "PER";
		}
		ArrayList<Character> list = new ArrayList<Character>();
		for(int i = 0; i < length; i++) {
			if(line.charAt(i) != thePers.charAt(i)) {
				list.add(line.charAt(i));
			}
		}
		Set<Character> hs = new HashSet<>();
		hs.addAll(list);
		list.clear();
		list.addAll(hs);
		System.out.println(list.size());
		
	}

}
*/