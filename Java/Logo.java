import java.util.*;
import java.util.concurrent.SynchronousQueue;
public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> directions = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String text = "";
		for(int i = 0; i < n; i++) {
			int q = sc.nextInt();
			sc.nextLine();
			for(int j = 0; j < q; j++) {
			
				text = sc.nextLine();
				directions.add(text.split(" ")[0]);
				numbers.add(Integer.parseInt(text.split(" ")[1]));
			}
			System.out.println(method(directions,numbers));
			directions.clear();
			numbers.clear();
			
		}
	}
	
	public static int method(ArrayList<String> dir, ArrayList<Integer> num) {
		int currDeg = 0;
		double xCoor = 0;
		double yCoor = 0;
		for(int i = 0; i < dir.size(); i++) {
			if(dir.get(i).equals("fd")) {
				xCoor += num.get(i) * Math.cos(Math.toRadians(currDeg));
				yCoor += num.get(i) * Math.sin(Math.toRadians(currDeg));
			}else if(dir.get(i).equals("bk")) {
				xCoor -= num.get(i) * Math.cos(Math.toRadians(currDeg));
				yCoor -= num.get(i) * Math.sin(Math.toRadians(currDeg));
			}else if(dir.get(i).equals("lt")) {
				currDeg+= num.get(i);
			}else{
				currDeg -= num.get(i);
			}
	
		}
		
		
		
		return (int) Math.round(Math.sqrt(Math.pow(xCoor, 2) + Math.pow(yCoor, 2)));
	}

}
