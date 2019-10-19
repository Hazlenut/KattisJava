import java.util.*;
public class Apaxiaaans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		ArrayList<Character> theChar = new ArrayList<Character>();
		for(int i = 0; i < word.length(); i++) {
			theChar.add(word.charAt(i));
		}
		for(int i = 0; i < theChar.size()-1; i++) {
			if(theChar.get(i) == theChar.get(i+1)) {
				theChar.remove(i);
				i--;
			}
		}
		for(int i = 0; i < theChar.size(); i++) {
			System.out.print(theChar.get(i));
		}
	}

}
