import java.util.*;
public class Volim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int position = sc.nextInt();
		int num = sc.nextInt();
		sc.nextLine();

		int total = 0;
		while(num != 0) {
			String line = sc.nextLine();
			total += Integer.parseInt(line.split(" ")[0]);
			if(total>= 230) {
				break;
			}

			if((line.split(" ")[1]).charAt(0)=='T') {
				position++;
				
			}
			num--;
		}
		if(position%8 == 0) {
			System.out.println(8);
		}else{
		System.out.println((position)%8);
	}
	}

}
