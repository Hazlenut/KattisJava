import java.util.*;

public class NumberFun {
	public static String calc(int a, int b, int c) {
		if (a + b == c || a - b == c || a * b == c || (a / b == c && a%b == 0) || b - a == c || (b%a == 0 && b / a == c)) {
			return "possible";
		} else {
			return "impossible";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String text = "";
		String[] test = new String[num];
		for (int i = 0; i < num; i++) {
			text = sc.nextLine();
			test[i] = text;
		}
		String[] answers = new String[num];
		for(int i = 0; i < num; i++) {
			answers[i] = calc(Integer.parseInt(test[i].split(" ")[0]), Integer.parseInt(test[i].split(" ")[1]), Integer.parseInt(test[i].split(" ")[2]));
			
		}
		for(int i = 0; i < num; i++) {
			System.out.println(answers[i]);
		}

	}

}

/*
 * import java.util.*;
 * 
 * public class NumberFun {
 * 
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * int rounds = sc.nextInt(); boolean[] answers = new boolean[rounds]; for (int
 * i = 0; i < rounds; i++) { answers[i] = calc(); }
 * 
 * for (int k = 0; k < rounds; k++) { if (answers[k]) {
 * System.out.println("Possible"); } else { System.out.println("Impossible"); }
 * }
 * 
 * }
 * 
 * // TODO Auto-generated method stub public static boolean calc() { Scanner sc
 * = new Scanner(System.in); int a = sc.nextInt(); int b = sc.nextInt(); int c =
 * sc.nextInt(); boolean possible = false; if (a + b == c || a - b == c || b - a
 * == c || a * b == c || (b / a == c && b % a == 0) || (a / b == c && a % b ==
 * 0)) { possible = true; } return possible; }
 * 
 * }
 * 
 * import java.util.*; public class NumberFun { public static boolean calc(int
 * a, int b, int c) { if(a+b == c || a-b == c || a * b == c || a/b == c || b-a
 * == c || b /a == c) { return true; }else{ return false; } }
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * Scanner sc = new Scanner(System.in); int rounds = sc.nextInt(); int[]
 * theValues = new int[3]; String[] answers = new String[rounds]; String[]
 * values = new String[3]; for(int i = 0; i < rounds; i++) { String line =
 * sc.next(); values = line.split(" "); theValues[i] =
 * Integer.parseInt(values[i]); if(calc(theValues[0], theValues[1],
 * theValues[2])) { answers[i] = "Possible"; }else{ answers[i] = "Impossible"; }
 * 
 * } for(int i = 0; i < rounds; i++) { System.out.println(answers[i]);
 * 
 * }
 * 
 * } }
 */