import java.util.*;
public class Moose{
    public static boolean equal(int x, int y) {
        if(x==y) {
            return true;
        }
        return false;
    }
    public static int test(int x, int y) {
        if(equal(x,y)) {
            return x *2;
        }else if(x > y) {
            return x *2;
        }else if(y > x) {
            return y *2;
        }
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] value = new String[2];
        value = line.split(" ");
        int[] values = new int[2];
        for(int i = 0; i < 2; i++) {
            values[i] = Integer.parseInt(value[i]);
        }
        if(values[0] == 0 && values[1] == 0) {
        	System.out.println("Not a moose");
        }else{ 
        boolean isEqual = equal(values[0],values[1]);
        int answer = test(values[0],values[1]);
        if(isEqual) {
            System.out.println("Even " + answer);
        }else{
            System.out.println("Odd " + answer);
        }
        }
        
        
    }}
