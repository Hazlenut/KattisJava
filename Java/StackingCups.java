import java.util.*;
public class StackingCups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		for(int i = 0; i < num; i++) {
			String x = sc.next();
			int y;
			if(x.matches("-?\\d+")) {
				y = Integer.parseInt(x);
				x = sc.next();
				/*System.out.println("here");
				System.out.println("String " + x);
				System.out.println("Int " + y);*/
				map.put(x, y/2);
			}else{
				y = sc.nextInt();
			/*	System.out.println("there");
				System.out.println("String " + x);
				System.out.println("Int " + y);*/
				map.put(x, y);
				
			}
			sc.nextLine();
		}
		LinkedHashMap<String,Integer> keys = sortHashMapByValues(map);
		for(String c: keys.keySet()) {
			System.out.println(c);
		}
	}
	public static LinkedHashMap<String,Integer> sortHashMapByValues(
	        HashMap<String, Integer> passedMap) {
	    List<String> mapKeys = new ArrayList<>(passedMap.keySet());
	    List<Integer> mapValues = new ArrayList<>(passedMap.values());
	    Collections.sort(mapValues);
	    Collections.sort(mapKeys);

	    LinkedHashMap<String,Integer> sortedMap =
	        new LinkedHashMap<>();

	    Iterator<Integer> valueIt = mapValues.iterator();
	    while (valueIt.hasNext()) {
	        Integer val = valueIt.next();
	        Iterator<String> keyIt = mapKeys.iterator();

	        while (keyIt.hasNext()) {
	            String key = keyIt.next();
	            Integer comp1 = passedMap.get(key);
	            Integer comp2 = val;

	            if (comp1.equals(comp2)) {
	                keyIt.remove();
	                sortedMap.put(key, val);
	                break;
	            }
	        }
	    }
	    return sortedMap;
	}

}
