import java.util.*;
public class Kemija {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		line = line.replaceAll("apa", "a");
		line = line.replaceAll("epe", "e");
		line = line.replaceAll("ipi", "i");
		line = line.replaceAll("opo", "o");
		line = line.replaceAll("upu", "u");
		System.out.println(line);
	}

}
