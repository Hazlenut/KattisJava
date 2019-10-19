import java.util.*;
public class Locker {
	public static int lockerCalc(int[] combo) {
		int position = combo[0];
		int total = 720;
		int multiplier = 9;
		total += combo[1] *multiplier;
		position = combo[1];
		total+= 360;
		if(combo[1] < combo[2]) {
			total += 360 - (combo[2] - combo[1]) * multiplier;
		}else{
			total += multiplier * (combo[1] - combo[2]);
		}
		position = combo[2];
		if(combo[3] > combo[2]) {
			total += multiplier * (combo[3] - combo[2]);
		}else{
			total += 360 - (combo[3] - combo[2]) * multiplier;
		}
		
		
		
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> answers = new ArrayList<Integer>();
		String inputs = "";
		String[] theValues = new String[4];
		int[] finalValues = new int[4];
		for(int k = 0; k < 2000; k++) {
			inputs = sc.nextLine();
			if(inputs.equals("0 0 0 0")) {
				break;
			}
			
				theValues = inputs.split(" ");
				for(int i = 0; i < 4; i++) {
				finalValues[i] = Integer.parseInt(theValues[i]);
				
			}
				answers.add(lockerCalc(finalValues));
		}
		for(int i = 0; i < answers.size(); i++) {
			System.out.println(answers.get(i));
		}
		
	}

}
