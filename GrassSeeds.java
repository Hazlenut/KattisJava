import java.util.*;
public class GrassSeeds {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    double cost = s.nextDouble();
	    int numLawns = s.nextInt();
	    double total = 0;
	    for(int i = 0; i < numLawns; i++) {
	        total += s.nextDouble() * s.nextDouble() * cost;
	    }
	    System.out.println(total);
	    s.close();
	}
}