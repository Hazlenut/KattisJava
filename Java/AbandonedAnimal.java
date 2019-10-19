import java.util.*;
public class AbandonedAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numSuper = sc.nextInt();
		int rounds = sc.nextInt();
		sc.nextLine();
		String[] array = new String[rounds];
		for(int i = 0; i < rounds; i++) {
			array[i] = sc.nextLine();
		}
		ArrayList<String> sorted = new ArrayList<String>();
		for(int x = 0; x < rounds; x++) {
			thispart:
		for(int i = 1; i <= numSuper; i++) {
			if(Integer.parseInt(array[x].split(" ")[0]) == i) {
				sorted.add(array[i]);
				break thispart;
			}
		}
		}
		int items = sc.nextInt();
		sc.nextLine();
		String[] itemList = new String[items];
		for(int i = 0; i < items; i++) {
			itemList[i] = sc.next();
		}
		int total = 0;
		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<Integer> thisOne = new ArrayList<Integer>();
		for(int i = 0; i < rounds-1; i++) {
			if(sorted.get(i) == itemList[i]) {
				total++;
				map.put(itemList[i], i);
				thisOne.add(i);
			}
		}
		System.out.println("thisOne" + map.get("chocolate"));
		if(total != rounds ) {
			System.out.println("impossible");
		}else{
			int total1 = 0;
			for(int i = 0; i < rounds; i++) {
				if(sorted.get(i) == itemList[i]) {
					total1++;
		}
			}
			if(total1 == rounds) {
				System.out.println("ambiguous");
			}else{
				System.out.println("unique");
			}
	}
	}
}
