import java.util.*;
public class SpeedLimit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int round=0;
		while(round != -1) {
			int total = 0;
			
			round = sc.nextInt();
			if(round == -1) {
				break;
			}
			int initial = 0;
			int newVal = 0;
			for(int i = 0; i < round ; i++) {
				total += sc.nextInt() * ((newVal= sc.nextInt())-initial);
				initial = newVal;
			
			}
			System.out.println(total + " miles");
			
		}
	}
}












/*import java.util.*;
public class SpeedLimit {
	public static int getTravel(int num) {
		Scanner sc = new Scanner(System.in);
		String[] test = new String[num];
		for(int i = 0; i < num; i++) {
			test[i] = sc.nextLine();
		}
		int total = 0;
		for(int i = 0; i < num; i++) {
			if(i == 0) {
			total += (Integer.parseInt(test[i].split(" ")[0]) * Integer.parseInt(test[i].split(" ")[1]));
			//System.out.println("1. " + Integer.parseInt(test[i].split(" ")[0]));
		//	System.out.println("2. " + Integer.parseInt(test[i].split(" ")[1]));
			}else{
				total += (Integer.parseInt(test[i].split(" ")[0]) * ((Integer.parseInt(test[i].split(" ")[1]))-Integer.parseInt(test[i-1].split(" ")[1])));
				//System.out.println("1. " + Integer.parseInt(test[i].split(" ")[0]));
				//System.out.println("2. " + Integer.parseInt(test[i].split(" ")[1]));
				//System.out.println("3. " + Integer.parseInt((test[i-1].split(" ")[1])));
			}
		}
		
		
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int x = -1;
		while(x != 91) {
			num = sc.nextInt();
			if(num == -1) {
				break;
			}
			System.out.println(getTravel(num));
		}
	}

}
*/