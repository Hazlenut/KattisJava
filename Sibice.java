import java.util.*;
public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String value = sc.nextLine();
        String[] values = value.split(" ");
        int[] values1 = new int[3];
        for(int i = 0; i < 3; i++) {
        values1[i] = Integer.parseInt(values[i]);
        }
        String[] answers = new String[values1[0]];
        for(int i = 0; i < values1[0]; i++) {
        	int k = sc.nextInt();
        	double possible = Math.sqrt((Math.pow(values1[1], 2) + Math.pow(values1[2], 2)));
            if(k <= values1[1] || k <= values1[2] || k <= possible) {
                answers[i] = "DA";
            }else{
                answers[i] = "NE";
            }
        }
        for(int i = 0; i < answers.length; i++) {
        	System.out.println(answers[i]);
        }
    }
}