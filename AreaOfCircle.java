import java.util.*;
public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean stop = false;
		while(!stop) {
			String text = sc.nextLine();
			if(text.equals("0 0 0")) {
				stop = true;
				break;
			}
			String[] array = new String[3];
			array = text.split(" ");
			double[] inputs = new double[3];
			for(int i = 0; i < 3; i++){
				inputs[i] = Double.parseDouble(array[i]);
			}
			double r = inputs[0];
			double m = inputs[1];
			double c = inputs[2];
			double areaR = (r*2) * (r*2);
			double areaC = Math.pow(r, 2) * Math.PI;
			double fraction = m/c;
			System.out.println(areaC + " " + ((c/m) * areaR));
			
		}
		
	}

}
