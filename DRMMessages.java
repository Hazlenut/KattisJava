import java.util.*;
public class DRMMessages {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.toLowerCase();
		String first = divide(line)[0];
		String second = divide(line)[1];
	/*	System.out.println(first + " " + second);*/
		String resF = rotate(first);
		String resS = rotate(second);
		String result = merge(resF, resS);
		System.out.println(result.toUpperCase());
	}
	public static String[] divide(String line) {
		String[] array = new String[2];
		array[0] = line.substring(0,line.length()/2);
		array[1] = line.substring(line.length()/2);
		return array;
	}
	public static int rotationNum(String line) {
		int total = 0;
		
		for(int i = 0; i < line.length(); i++) {
			
			total+= ((int)(line.charAt(i))%97);
		}
		return total;
	}
	public static String rotate(String line) {
		String res = "";
		for(int i = 0; i < line.length(); i++) {
			int a =(char)(((line.charAt(i)-97 + rotationNum(line))%26) +97);
			char c = (char) a;
			res += Character.toString(c);

		}
		return res;
	}
	public static String merge(String line1, String line2) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		String res = "";
		for(int i = 0; i < line1.length(); i++) {
			array.add(line2.charAt(i)%97);
		}
		for(int i = 0; i < line2.length(); i++) {
			int a = (char)(((line1.charAt(i) -97 + array.get(i))%26) +97);
			char c = (char)a;
			res += Character.toString(c);
		}
		
		return res;
	}
 	
}





