import java.util.*;
public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds = sc.nextInt();
        int[] array = new int[rounds];
        for(int i = 0; i < rounds; i++) {
            array[i] = sc.nextInt();
        }
        int total = 0;
        int power = 0;
        for(int i = 0; i< array.length; i++) {
        	power = array[i] % 10;
        	array[i] = array[i] / 10;
            total += Math.pow(array[i], power);
        }
        System.out.println(total);
    }
}