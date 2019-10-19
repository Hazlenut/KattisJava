import java.util.*;
public class Spavanac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		if(m > 45) {
			m -= 45;
		}else if(m == 45) {
			m = 0;
		}else{
			if(h!=0) {
				m=60-(45-m);
				h-=1;
			}else{
				m=60-(45-m);
				h=23;
			}
		}
		System.out.println(h + " " + m);
		
	}

}
