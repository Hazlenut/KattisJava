import java.util.*;
public class TripleTexting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] array = {"","",""};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < line.length()/3; j++) {
				array[i] += line.charAt((i*(line.length()/3)) + j);
			}
		}
		if(array[0].equals(array[1])) {
			System.out.println(array[0]);
		}else if(array[1].equals(array[2])) {
			System.out.println(array[1]);
		}else {
			System.out.println(array[2]);
		}
	}

}
