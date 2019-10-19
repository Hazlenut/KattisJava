import java.util.*;
public class GoatRope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int pointX = sc.nextInt();
		int pointY = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		ArrayList<Integer> xCoor = new ArrayList<Integer>();
		ArrayList<Integer> yCoor = new ArrayList<Integer>();
		for(int i = x; i <= x1; i++) {
			xCoor.add(i);
			yCoor.add(y);
			xCoor.add(i);
			yCoor.add(y1);
		}
		for(int i = y; i <= y1; i++) {
			xCoor.add(x);
			yCoor.add(i);
			xCoor.add(x1);
			yCoor.add(i);
		}
		double dist = getDistance(xCoor.get(0), yCoor.get(0),pointX,pointY);
		for(int i = 1; i < xCoor.size(); i++) {
			if(getDistance(xCoor.get(i),yCoor.get(i),pointX,pointY) < dist) {
				dist = getDistance(xCoor.get(i), yCoor.get(i),pointX,pointY);
			}
		}
		System.out.println(dist);
		
	}
	public static double getDistance(int x, int y, int x1, int y1) {
		double res  = Math.sqrt(Math.pow(x1-x, 2) + Math.pow(y1-y, 2));
		return res;
	}

}
