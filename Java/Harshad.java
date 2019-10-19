import java.util.*;
public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int perm = num;
		boolean test = false;
		int result = 0;
		while(!test) {
			if(num%digitSum(num) == 0) {
				result = num;
				test = true;
			}else{
				num++;
			}
				
		}
		System.out.println(result);
	}
	public static int digitSum(int num) {
		int x = 0;
		int total = 0;
		while(num > 0)
        {
            x = num % 10;
            total = total + x;
            num = num / 10;
        }
		return total;
	}

}
