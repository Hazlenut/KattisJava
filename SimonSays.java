import java.util.*;
public class SimonSays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String text = "";
		ArrayList<String> test = new ArrayList<String>();
		for(int i = 0; i < num; i++) {
			text = sc.nextLine();
			if(text.length() >=10) {
			if(text.substring(0, 10).equals("Simon says")) {
				test.add(text.substring(10));
				
			}
			}else{
				continue;
			}
		}
		for(int i = 0; i < test.size(); i++) {
			System.out.println(test.get(i));
		}
	}

}
