import java.util.*;
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] value = new String[3];
		int[] values = new int[3];
		value = line.split(" ");
		for(int i = 0; i < 3; i++) {
			values[i]=Integer.parseInt(value[i]);
		}
		int a = values[0];
		int b = values[1];
		int c = values[2];
		for(int i = 1; i <= c; i++) {
			if(i%a == 0 && i%b == 0) {
				System.out.println("FizzBuzz");
			}else if(i%a == 0) {
				System.out.println("Fizz");
			}else if(i%b == 0) {
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
	}

}
