import java.util.*;
public class Easiest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n == 0) {
				break;
			}
			int total = getDigitsTotal(n);
			boolean cont = false;
			int i = 11;
			while(!cont) {
				if(total == getDigitsTotal(i*n)) {
					System.out.println(i);
					break;
				}
				i++;
			}
		}
	}
		public static int getDigitsTotal(int a) {
			int total =0;
			while (a > 0) {
				total += a%10;
				a = a /10;
			}
			return total;
		}
	
}



/*import java.util.*;
public class Easiest {
	public static int getDigitsTotal(int a) {
		int total =0;
		while (a > 0) {
			total += a%10;
			a = a /10;
		}
		return total;
	}
	public static int test(int x) {
		int foundNumber = 0;
		int digits = 0;
		int value = x;
		digits = getDigitsTotal(value);
		for(int i = 11; i < 100000; i++) {
			if(i == 100) {
				continue;
			}
			foundNumber = i * x;
			
			int newDigits = getDigitsTotal(foundNumber);
			
			if(newDigits == digits) {
				return i;
			}
		}
		
		
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> outputs = new ArrayList<Integer>();
		for(int i =0; i < 100000; i++) {
			int x = sc.nextInt();
			if(x == 0) {
				break;
			}
			outputs.add(test(x));
		}
		for(int i =0; i < outputs.size(); i++) {
			System.out.println(outputs.get(i));
		}
	}

}
*/