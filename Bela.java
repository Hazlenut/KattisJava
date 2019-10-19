import java.util.*;
public class Bela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int hands = Integer.parseInt(line.split(" ")[0]);
		String dom = line.split(" ")[1];
		int total = 0;
		for(int i = 0; i < hands * 4; i++) {
			String text = sc.nextLine();
			if(text.charAt(0) == 'A') {
				total+=11;
			}else if(text.charAt(0) == 'K') {
				total+= 4;
			}else if(text.charAt(0) == 'Q') {
				total+= 3;
			}else if(text.charAt(0) == 'J') {
				if(checkDom(text,dom)) {
					total+=20;
				}else{
					total+=2;
				}
			}else if(text.charAt(0) == 'T') {
				total+=10;
			}else if(text.charAt(0) == '9') {
				if(checkDom(text,dom)) {
					total+=14;
				}
			}else if(text.charAt(0) == '8') {
				
			}else{
				
			}
			
		}
		System.out.println(total);
	}
	public static boolean checkDom(String line, String dom) {
		if(line.charAt(1) == dom.charAt(0)) {
			return true;
		}else{
			return false;
		}
	
	}

}
