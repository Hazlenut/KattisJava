import java.util.*;
public class HangingOut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String inputs = sc.nextLine();
		int max = Integer.parseInt(inputs.split(" ")[0]);
		int num = Integer.parseInt(inputs.split(" ")[1]);
		ArrayList<String> actions = new ArrayList<String>();
		ArrayList<Integer> number = new ArrayList<Integer>();
		String test = "";
		for(int i = 0; i < num; i++) {
			test = sc.nextLine();
			actions.add(test.split(" ")[0]);
			number.add(Integer.parseInt(test.split(" ")[1]));
			
		}
		int total = 0;
		int reject = 0;
		for(int i = 0; i < num; i++) {
			if(actions.get(i).equals("enter")) {
				if(number.get(i) + total <= max) {
					total += number.get(i);
				}else{
					reject++;
				}
			}else{
				if(!(total - number.get(i) < 0)) {
					total -= number.get(i);
				}else{
					reject++;
				}
			}
		}
		System.out.println(reject);
	}

}
