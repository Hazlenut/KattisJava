import java.util.*;
public class Skener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inputR = sc.nextInt();
		int inputC = sc.nextInt();
		int multiR = sc.nextInt();
		int multiC = sc.nextInt();
		sc.nextLine();
		String[] array = new String[inputR];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextLine();
		}
		ArrayList<String> newarray = new ArrayList<String>();
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < multiR; j++) {
				newarray.add(array[i]);
				
			}

}
		for(int i = 0; i < newarray.size(); i++) {
			newarray.set(i, method(newarray.get(i),multiC));
			
		}
		for(int i = 0; i < newarray.size(); i++) {
			System.out.println(newarray.get(i));
		}
		
}
	public static String method(String x, int multiC) {
		String res = "";
		for(int k = 0; k < x.length(); k++) {
		for(int i = 0; i < multiC; i++) {
			res += x.charAt(k);
		}
		}
		
		
		return res;
	}
}
