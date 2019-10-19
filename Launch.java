import java.util.*;
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[sc.nextInt()];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int index = -1;
		int num = 100001;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < num) {
				index = i;
				num = array[i];
			}
		}
		System.out.println(index);
	}

}
