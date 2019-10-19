import java.util.*;
public class BusNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numBusses = Integer.parseInt(sc.nextLine());
		int[] allBusses = new int[numBusses];
		String line = sc.nextLine();
		String[] allBus = new String[numBusses];
		allBus = line.split(" ");
		int n = 0;
		for(String i: allBus) {
			allBusses[n] = Integer.parseInt(i);
			n++;
		}
		int index = -1;
		for(int i = numBusses-1; i >= 0; i--) {
			if(allBusses[i] == allBusses[i-numBusses-1]) {
				index = i;
			}
		}
	}

}
