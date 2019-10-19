import java.util.*;
public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = -1;
		int round = 1;
		while(num != 0) {
			num = sc.nextInt();
			sc.nextLine();
			if(num == 0) {
				break;
			}
			System.out.println("SET " + round);
			round++;
			String[] array = new String[num];
			for(int i = 0; i < array.length; i++) {
				array[i] = sc.nextLine();
			}
			String[] result = new String[num];
			int k = 0;
			for(int i = 0; i < array.length; i+=2) {
				result[k] = array[i];
				k++;
			}
			int a = 1;
			if(num % 2 != 0) {
				a =2 ;
			}
			for(int i = array.length-a; i > 0; i-=2) {
				result[k]= array[i];
				k++;
			}
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
			
			
		}
	}

}
