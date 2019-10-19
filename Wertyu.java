
/*import java.util.*;
public class Wertyu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Character[] topLine = {'q','w','e','r','t','y','u','i','o','p','[',']','\\'};
		Character[] numLine = {'1','2','3','4','5','6','7','8','9','0','-','='};
		Character[] midLine = {'a','s','d','f','g','h','j','k','l',';','\''};
		Character[] botLine = {'z','x','c','v','b','n','m',',','.','/'};
		Character[] altNum = {'!', '@','#','$', '%','^','&','*','(',')','_','+'};
		Character[] altTop = {'q','w','e','r','t','y','u','i','o','p','{','}','|'};
		Character[] altMid = {'a','s','d','f','g','h','j','k','l',':','"'};
		Character[] altBot = {'z','x','c','v','b','n','m','<','>','?'};
		ArrayList<String> allInputs = new ArrayList<String>();
		while(sc.hasNextLine()) {
			
			allInputs.add(sc.nextLine());
		
		}
		for(int a = 0; a < allInputs.size(); a++) {
		String text = allInputs.get(a);
		ArrayList<Character> textLine = new ArrayList<Character>();
		ArrayList<Integer> upper = new ArrayList<Integer>();
		for(int i = 0; i < text.length(); i++) {
			
			if(Character.isUpperCase(text.charAt(i))) {
				upper.add(i);
			}
			textLine.add(text.charAt(i));
			textLine.set(i, Character.toLowerCase(textLine.get(i)));
		}
		
		
		for(int i = 0; i < textLine.size(); i++) {
			if(textLine.get(i) == ' ') {
				
			}else if(Arrays.asList(topLine).contains(textLine.get(i))) {
				textLine.set(i, topLine[Arrays.asList(topLine).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(numLine).contains(textLine.get(i))) {
				textLine.set(i, numLine[Arrays.asList(numLine).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(midLine).contains(textLine.get(i))) {
				textLine.set(i, midLine[Arrays.asList(midLine).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(botLine).contains(textLine.get(i))){
				textLine.set(i, botLine[Arrays.asList(botLine).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(altTop).contains(textLine.get(i))) {
				textLine.set(i, altTop[Arrays.asList(altTop).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(altNum).contains(textLine.get(i))) {
				textLine.set(i, altNum[Arrays.asList(altNum).indexOf(textLine.get(i))-1]);
			}else if(Arrays.asList(altMid).contains(textLine.get(i))) {
				textLine.set(i, altMid[Arrays.asList(altMid).indexOf(textLine.get(i))-1]);
			}else{
				textLine.set(i, altBot[Arrays.asList(altBot).indexOf(textLine.get(i))-1]);
			}
			System.out.println(textLine.get(i));
		}
		String end = "";
		for(int i = 0; i < textLine.size(); i++) {
			if(!upper.contains(i)) {
			end += textLine.get(i);
			}else{
				end+= Character.toUpperCase(textLine.get(i));
			//}
				
		}
		allInputs.set(a,end);
		}
	
	for(int i = 0; i < allInputs.size(); i++) {
		System.out.println(allInputs.get(i));
	}
		
		
	}

}
*/
import java.util.*;

public class Wertyu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character[] topLine = {'q','w','e','r','t','y','u','i','o','p','[',']','\\'};
		Character[] numLine = {'1','2','3','4','5','6','7','8','9','0','-','='};
		Character[] midLine = {'a','s','d','f','g','h','j','k','l',';','\''};
		Character[] botLine = {'z','x','c','v','b','n','m',',','.','/'};
		while(sc.hasNextLine()) {
			String text = sc.nextLine();
			text = text.toLowerCase();
			String end = "";
			for(int i = 0; i < text.length(); i++) {
				
			if(text.charAt(i) == ' ') {
				end += " ";
			}else if(Arrays.asList(topLine).contains(text.charAt(i))) {
				end += topLine[Arrays.asList(topLine).indexOf(text.charAt(i))-1];
			}else if(Arrays.asList(numLine).contains(text.charAt(i))) {
				end += numLine[Arrays.asList(numLine).indexOf(text.charAt(i))-1];
			}else if(Arrays.asList(midLine).contains(text.charAt(i))) {
				end += midLine[Arrays.asList(midLine).indexOf(text.charAt(i))-1];
			}else if(Arrays.asList(botLine).contains(text.charAt(i))){
				end += botLine[Arrays.asList(botLine).indexOf(text.charAt(i))-1];
			
			
		}
			
	}
			System.out.println(end.toUpperCase());
			end = "";
}
	}
}