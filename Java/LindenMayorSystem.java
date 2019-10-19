/*import java.util.*;
public class LindenMayorSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int patterns = Integer.parseInt(line.split(" ")[0]);
		int repeat = Integer.parseInt(line.split(" ")[1]);
		System.out.println(patterns);
		System.out.println(repeat);
		String[] input = new String[patterns];
		String[] output = new String[patterns];
		for(int i = 0; i < patterns; i++) {
			String thePattern = sc.nextLine();
			input[i] = thePattern.split(" -> ")[0];
			output[i] = thePattern.split(" -> ")[1];
			
			
		}
		ArrayList<String> theInputs = new ArrayList<String>(Arrays.asList(input));
		ArrayList<String> theOutputs = new ArrayList<String>(Arrays.asList(output));
		String start = sc.nextLine();
		for(int i = 0; i < repeat; i++) {
			for(int j = 0; j < patterns; j++) {
				if(start.contains(theInputs.get(j)));
					 start = start.replaceAll(theInputs.get(j), theOutputs.get(j));
					 System.out.println(start);
			}
			
			
		}
		System.out.println(start);
	}

}
*/

/*import java.util.*;
public class LindenMayorSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		int patterns = Integer.parseInt(line.split(" ")[0]);
		int repeats = Integer.parseInt(line.split(" ")[1]);
		ArrayList<String> inputs = new ArrayList<String>();
		
		ArrayList<String> theInputs = new ArrayList<String>();
		ArrayList<String> theOutputs = new ArrayList<String>();
		for(int i = 0; i < patterns; i++) {
			String thePattern = sc.nextLine();
			theInputs.add(thePattern.split(" -> ")[0]);
			theOutputs.add(thePattern.split(" -> ")[1]);
			
		}
		String start = sc.nextLine();
		inputs.ad)
		for(int i = 0; i < repeats; i++) {
			for(int j = 0; j < patterns; j++) {
				for(int k = 0; k < inputs.size(); k++) {
					if(start)theInputs.get(j)) {
						blank += theOutputs.get(j);
					}
					
				}
			}
		}
		for(int i = 0; i < inputs.size();i++) {
			System.out.print(inputs.get(i));
		}
	}
}*/


import java.util.*;
public class LindenMayorSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ltext = sc.nextLine();
		int patterns = Integer.parseInt(ltext.split(" ")[0]);
		int repeats = Integer.parseInt(ltext.split(" ")[1]);
		String[] theInputs = new String[patterns];
		String[] theOutputs = new String[patterns];
		for(int i = 0; i < patterns; i++) {
			String line = sc.nextLine();
			theInputs[i] = line.split(" -> ")[0];
			theOutputs[i] = line.split(" -> ")[1];
			
		}
		String start = sc.nextLine();
		String end = "";
		for(int i = 0; i < repeats; i++) {
			for(int j = 0; j < patterns; j++) {
				if(i + theInputs[j].length() < start.length()) {
				if(start.substring(i, theInputs[j].length()).equals(theInputs[j])) {
					end+= theOutputs[j];
					System.out.println(end);
				}
			}
			}
			start = end;
			System.out.println(start);
			System.out.println(end);
			end = "";
		}
		System.out.println(start);
	}
}