import java.util.*;
public class NoDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int num =1 ;
		for(int i = 0; i < line.length(); i++) {
			if(line.charAt(i) == ' ') {
				num++;
			}
		}
		String[] value = new String[num];
		value = line.split(" ");
		for(int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		int x = 0;
		green:
		for(int i = 0; i < value.length; i++) {
			for(int j = i+1; j < value.length; j++) {	
				if(!value[i].equals(value[j])) {
					continue;
				}else {
					System.out.println("no");			
					x = 5;
					break green;
				}
			}
		}
		if(x != 5) {
		System.out.println("yes");
	}
	}

}
