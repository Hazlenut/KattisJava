import java.util.*;
public class Poker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		char[] array = new char[5];
		for(int i = 0; i < 5; i++) {
			array[i] = line.split(" ")[i].charAt(i);
		}
		Map<Character, Integer> aset = new HashMap<Character,Integer>();
		for(char a: array) {
			int count = aset.get(a);
			count++;
			aset.put(a, count);
		}
	}
}
