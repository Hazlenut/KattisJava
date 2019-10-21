import java.util.*;
public class TheGrandAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		for(int j = 0; j < n; j++) {
			boolean test = true;
			String line = sc.nextLine();
			ArrayList<Character> list = new ArrayList<Character>();
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == '$') {
					list.add('$');
				}else if(line.charAt(i) == '|') {
					list.add('|');
				}else if(line.charAt(i) == '*') {
					list.add('*');
				}else if(line.charAt(i) == 't') {
					if(list.size() == 0) {
						test = false;
						break;
					}
					if(list.get(list.size()-1) == '|') {
						list.remove(list.size()-1);
					}else {
						test = false;
						break;
					}
				}else if(line.charAt(i) == 'j') {
					if(list.size() == 0) {
						test = false;
						break;
					}
					if(list.get(list.size()-1) == '*') {
						list.remove(list.size()-1);
					}else {
						test = false;
						break;
					}
				}else if(line.charAt(i) == 'b') {
					if(list.size() == 0) {
						test = false;
						break;
					}
					if(list.get(list.size()-1) == '$') {
						list.remove(list.size()-1);
					}else {
						test = false;
						break;
					}
				}else if(line.charAt(i) == '.') {
					
				}
			}
			if(list.size() != 0) {
				test = false;
			}
			if(test) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}

}
