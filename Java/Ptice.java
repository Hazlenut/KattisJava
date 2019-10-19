import java.util.*;
public class Ptice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		String adrian = "";
		String bruno = "";
		String goran = "";
		while(adrian.length() <n) {
			adrian += "ABC";
		}
		while(bruno.length()<n) {
			bruno+="BABC";
		}
		while(goran.length()<n) {
			goran +="CCAABB";
		}
		int a = 0, b= 0, c=0;
		sc.nextLine();
		String line = sc.nextLine();
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == adrian.charAt(i)) {
				a++;
			}
			if(line.charAt(i) == bruno.charAt(i)) {
				b++;
			}
			if(line.charAt(i) == goran.charAt(i)) {
				c++;
			}
		}
		int[] array = {a,b,c};
		int max = 0;
		for(int j: array) {
			if(j > max) {
				max = j;
			}
		}
		System.out.println(max);
		
			if(max == a) {
				System.out.println("Adrian");
			}
			if(max==b) {
				System.out.println("Bruno");
			}
			if(max==c) {
				System.out.println("Goran");
			}
		
		
	}
}

/*import java.util.*;

public class Ptice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] adrian = new char[n];
		char[] bruno = new char[n];
		char[] goran = new char[n];
		for (int i = 0; i < n; i++) {
			if (i % 3 == 0) {
				adrian[i] = 'A';
			} else if (i % 3 == 1) {
				adrian[i] = 'B';
			} else if (i % 3 == 2) {
				adrian[i] = 'C';
			}
			if (i % 4 == 0) {
				bruno[i] = 'B';
			} else if (i % 4 == 1) {
				bruno[i] = 'A';
			} else if (i % 4 == 2) {
				bruno[i] = 'B';
			} else if (i % 4 == 3) {
				bruno[i] = 'C';

			}
			if (i % 6 == 0 || i % 6 == 1) {
				goran[i] = 'C';
			} else if (i % 6 == 2 || i % 6 == 3) {
				goran[i] = 'A';
			} else if (i % 6 == 4 || i % 6 == 5) {
				goran[i] = 'B';
			}
		}

		sc.nextLine();
		String line = sc.nextLine();
		int a = 0;
		int b = 0;
		int c = 0;
		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == adrian[i]) {
				a++;
			}
			if (line.charAt(i) == bruno[i]) {
				b++;
			}
			if (line.charAt(i) == goran[i]) {
				c++;
			}
		}
		int m = 0;
		if (a > b && a > c) {
			m = a;
		} else if (b > a && b > c) {
			m = b;
		} else {
			m = c;
		}
		System.out.println(m);
		if (a == m) {
			System.out.println("Adrian");
		}
		if (b == m) {
			System.out.println("Bruno");
		}
		if (c == m) {
			System.out.println("Goran");
		}
	}

}
*/