import java.util.*;
public class RunLengthEncoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String c = sc.next();
		String input = sc.next();
		if(c.equals("D")) {
			System.out.println(decode(input));
		}else{
			System.out.println(encode(input));
		}
	}
	public static String encode(String input) {
		String output = "";
		for(int i = 0; i < input.length(); i++) {
			int dup = 1;
			for(int j = i+1; j < input.length();j++) {
			//	System.out.println("i: " + input.charAt(i));
			//	System.out.println("j: " + input.charAt(j));
				if(input.charAt(i) != input.charAt(j)) {
					break;
				}
				if(input.charAt(i) == input.charAt(j)) {
					dup++;
					i++;
				}
			}
			output+= input.charAt(i);

			output+= Integer.toString(dup);
		//	System.out.println(output);
			dup = 1;
		}
		
		
		
		return output;
	}
	
	
	
/*	public static String encode(String input) {
		String output = "";
		int dup = 1;
		for(int i = 0; i < input.length(); i++) {
			
			if(i == 0) {
				output+= input.charAt(i);
				output += Integer.toString(dup);
				continue;
			}
			if(input.charAt(i) == input.charAt(i-1)) {
				if(i == 1) {
					output = "";
				}
				dup++;
			}else{
				output += input.charAt(i);
				output += Integer.toString(dup);
				dup = 1;
				System.out.println(output);
			}
			
		}
		
		return output;
	}*/
/*	public static String encode(String input) {
		String output = "";
		for(int j = 0; j < input.length(); j++) {
			int dup = 1;
			while(input.charAt(j) == input.charAt(j+1)) {
				dup++;
				j++;
				if(j == input.length()-2) {
					break;
				}
				
			}
			output+= Character.toString(input.charAt(j));
			output+= Integer.toString(dup);;
			dup = 1;
			
		}
		return output;
	}*/
	public static String decode(String input) {
		String output = "";
		for(int i = 0; i < input.length(); i+=2) {
			for(int j = 0; j < Integer.parseInt(Character.toString(input.charAt(i+1))); j++) {
				output += input.charAt(i);
			}
		}
		
		return output;
	}

}
