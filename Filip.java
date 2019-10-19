import java.util.*;
public class Filip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] value = new String[2];
		int[] values = new int[2];
		value = line.split(" ");
		for(int i = 0; i < 2; i++) {
			values[i] = Integer.parseInt(value[i]);
			
		}
		int[] revVal = new int[2];
		String[] revVal1 = new String[2];
		String temp = "";
		for(int i = 0; i < 2; i++) {
			temp = "";
			while(values[i] > 0) {
				temp += Integer.toString(values[i]%10);
				values[i] = values[i]/10;
			}
			revVal1[i] = temp;
		}
		for(int i = 0; i < 2; i++) {
			revVal[i] = Integer.parseInt(revVal1[i]);
		}
		if(revVal[0] > revVal[1]) {
			System.out.println(revVal[0]);
		}else{
			System.out.println(revVal[1]);
		}
		
		
	}

}
