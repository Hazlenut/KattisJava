import java.util.*;
public class Hydra {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 300;
		int time = 0;
		while (true) {
			int h = sc.nextInt();
			int t = sc.nextInt();
			if(t == 0 && h == 0) {
				break;
			}
			if (t >=1) {
				t--;
				if(t < 0) {
					t = 0;
				}
				t+=2;
				time++;
			}
			if(h+2 < max) {
				h--;
				if(h < 0) {
					h = 0;
				}
				h--;
				if(h < 0) {
					h = 0;
				}
				time++;
			}
			if(h >= 1 && t + 2 < max) {
				t--;
				if(t <0) {
					t = 0;
				}
				t--;
				if(t <0) {
					t = 0;
				}
				time++;
			}
		System.out.println(time);
		time = 0;
		}
		
	}
}


/*import java.util.*;
public class Hydra
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		    int total = 0;
		    int h = sc.nextInt(), t = sc.nextInt();
		    if(h==0 && t == 0) {
		        break;
		    }
		    while(h%2==1 && t >1) {
		        t-=2;
		        if(t < 0) {
		            t=0;
		        }
		        h++;
		        total++;
		        System.out.println("H: " + h);
		        System.out.println("T: " + t);
		        System.out.println(total);
		    }
		    while(h!=0) {
		        h-=2;
		        if(h<0) {
		            h=0;
		        }
		        total++;
		        System.out.println("H: " + h);
		        System.out.println("T: " + t);
		        System.out.println(total);
		    }
		    if(h%2 == 1) {
		    while((t < 4 || t %2 == 1)) {
		        t++;
		        total++;
		        System.out.println("H: " + h);
		        System.out.println("T: " + t);
		        System.out.println(total);
		    }
		    }else{
		    	while(((t%2!=0))){
			        t++;
			        total++;
			        System.out.println("H: " + h);
			        System.out.println("T: " + t);
			        System.out.println(total);
		    }
		    }
		    while(t!=0 ){ 
		        t-=2;
		        if(t<0) {
		            t=0;
		        }
		        h++;
		        total++;
		        System.out.println("H: " + h);
		        System.out.println("T: " + t);
		        System.out.println(total);
		}
		while(h!=0 && t!= 0) {
		    h-=2;
		    total++;
		    System.out.println("H: " + h);
		        System.out.println("T: " + t);
		        System.out.println(total);
		}
		System.out.println(total);
		total =0;
	}
}
	
}*/