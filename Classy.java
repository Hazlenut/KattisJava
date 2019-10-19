import java.util.*;
import java.util.concurrent.SynchronousQueue;
public class Classy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<String> rank = new ArrayList<String>();
		ArrayList<Integer> rankInt = new ArrayList<Integer>();
		ArrayList<Integer> rankInt2 = new ArrayList<Integer>();
		for(int i = 0; i < n; i++) {
			int q = sc.nextInt();
			sc.nextLine();
			for(int j = 0; j < q; j++) {
				String line = sc.nextLine();
				names.add(line.split(": ")[0]);
				rank.add(line.split(": ")[1]);
				
			}
			for(int k = 0; k < q; k++) {
				rankInt.add(method(rank.get(k)));
				System.out.println(method(rank.get(k)));
			}
			Integer[] sortedRank = rankInt.toArray(new Integer[rankInt.size()]);
			Arrays.sort(sortedRank);
			for(int l = 0; l< q; l++) {
				System.out.println(names.get(rankInt.indexOf(sortedRank[l])));
			}
			names.clear();
			rank.clear();
			
		}
	}
	public static int method(String rank) {
		String[] values = rank.split("-");
		int total = 0;
		for(String i : values) {
			if(i.equals("upper")) {
				total +=1;
			}else if(i.equals("lower")) {
				total-=1;
			}else{
				
			}
		}
		return total;
	}

}
