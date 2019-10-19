import java.util.*;
public class AlphabetSpam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// symbols 33-64 , 91-96
		// upper 65-90
		// lower 97-122
		String line = sc.nextLine();
		int white = 0;
		int symbols = 0;
		int upper = 0;
		int lower = 0;
		for(int i = 0; i < line.length(); i++) {
			int c = (int) line.charAt(i);
			if(line.charAt(i) == '_') {
				white++;
			}else{
			if((c <=64  && c >=33)|| (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
				symbols++;
			}else if(c >= 65 && c <= 90) {
				upper++;
			}else if(c >=97 && c<=122) {
				lower++;
			}
			
		}
		}
		System.out.println((double) white/line.length());
		System.out.println((double) lower/line.length());
		System.out.println((double) upper/line.length());
		System.out.println((double) symbols/line.length());
	}

}
