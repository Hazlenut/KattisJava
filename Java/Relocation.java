import java.util.*;
public class Relocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < q; i++) {
			int conf = sc.nextInt();
			if(conf == 1) {
				array[sc.nextInt()-1] = sc.nextInt();
			}else{
				int a = sc.nextInt();
				int b = sc.nextInt();
				if(array[a-1] > array[b-1]) {
					System.out.println(Math.abs(array[a-1] - array[b-1]));
				}else{
					System.out.println(Math.abs(array[b-1] - array[a-1]));
				}
			}
		}
	}

}
