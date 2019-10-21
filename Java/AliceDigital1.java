import java.util.*;
public class AliceDigital1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int l = 0; l < n; l++) {
			String line = sc.nextLine();
			int dig = Integer.parseInt(line.split(" ")[0]);
			int m = Integer.parseInt(line.split(" ")[1]);
			String text = sc.nextLine();
			int count = 0;
			for(int i = 0; i < text.length(); i++) {
				if(text.charAt(i) == (char) (m+48)) {
					count++;
				}
			}
			text = text.replaceAll(" ", "");
			//System.out.println(count);
			//System.out.println(text);
			String[] res = new String[count];
			for(int i = 0; i < count; i++) {
				res[i] = text.split(Integer.toString(m))[i];
			}
			int[] fin = new int[count-1];
			int t1 = m;
			for(int i = 0; i < res[0].length(); i++) {
				t1+=Integer.parseInt(Character.toString(res[0].charAt(i)));
			}
			for(int i = 0; i < res[1].length(); i++) {
				t1+=Integer.parseInt(Character.toString(res[1].charAt(i)));
			}
			fin[0] = t1;
			for(int i = 1; i < count-1; i++) {
				int total = 0;
				for(int j = 0; j < res[i+1].length(); j++) {
					total+=Integer.parseInt(Character.toString(res[i+1].charAt(j)));
				}
				fin[i] = total+m;
			}
			int high = 0;
			for(int i = 0; i < fin.length; i++) {
				if(fin[i] > high) {
					high = fin[i];
				}
			}
			System.out.println(high);
			
		}
	}

}
