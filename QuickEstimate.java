	import java.util.*;
	public class QuickEstimate {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			sc.nextLine();
			String text = "";
			ArrayList<Integer> outputs = new ArrayList<Integer>();
			ArrayList<Character> test = new ArrayList<Character>();
			for(int i = 0; i < num; i++) {
				text = sc.nextLine();
				for(int j = 0; j < text.length(); j++) {
					test.add(text.charAt(j));
				}

				outputs.add(test.size());
				
				test.clear();
			}
			for(int i = 0; i < outputs.size(); i++) {
				System.out.println(outputs.get(i));
			}
		}
	
	}
