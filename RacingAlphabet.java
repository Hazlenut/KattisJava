import java.util.*;
public class RacingAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		double circ = 2.0*Math.PI*30;
		int total = 0;
		for(int i = 0; i < num; i++) {
			total = 0;
			String line = sc.nextLine();
			for(int j = 0; j < line.length()-1;j++) {
				total+= tickDist(line.charAt(j), line.charAt(j+1));
			}
			System.out.println((total *(circ/28.0))/15 + line.length());
		}
	}
	public static int tickDist(char a, char b) {
		int output = 0;
		String line = "abcdefghijklmnopqrstuvwxyz '";
		line = line.toUpperCase();
		ArrayList<Character> array = new ArrayList<Character>();
		for(int i = 0; i < line.length(); i++) {
			array.add(line.charAt(i));
		}
		if(array.indexOf(b) - (array.indexOf(a)) > 14 && array.indexOf(a) <= array.indexOf(b)) {
			output = array.indexOf(a) + (line.length()-array.indexOf(b));
		
		}else if(array.indexOf(a) - (array.indexOf(b)) > 14 && array.indexOf(a) > array.indexOf(b)) {
			output = array.indexOf(b) + (line.length() - array.indexOf(a));
		
		}else if(array.indexOf(a) > array.indexOf(b)){
			output = array.indexOf(a) - array.indexOf(b);
	
		}else{
			output = array.indexOf(b) - array.indexOf(a);
		}
		return output;
	}

}
