import java.util.*;
public class Heir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] array1 = method(Integer.toString(a));
		int[] array2 = method(Integer.toString(b));
		ArrayList<Integer> alist1 = new ArrayList<Integer>();
		alist1 = Arrays.asArrayList(array1);
		
		
		for(int i = 0; i < 10; i++) {
			if(a%i == 0) {
				
			}
		}
		System.out.println(total);
	}
	public static int[] method(String n) {
		
		int[] array = new int[n.length()];
		int number = Integer.parseInt(n);
		int i = 0;
		while (number > 0) {
		    array[i] = number %10;
		    System.out.println("yes tengo " + array[i]);
		    number = number / 10;
		    i++;
		}
		return array;
	}
			}
