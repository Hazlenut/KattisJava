import java.util.*;
public class Wonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int points = 0;
        int t = 0, c = 0, g =0, low =0;
        char[] cards = new char[input.length()];
       
        for(int i =0; i < input.length(); i++) {
            cards[i] = input.charAt(i);
            if(cards[i] == 'T') {
                t++;
            }else if(cards[i] == 'C') {
                c++;
            }else if(cards[i] == 'G') {
                g++;
            }
        }
          
        
        if(t <= c && t <= g) {
            low = t;
        }else if(c <= t && c <= g) {
            low = c;
        }else if(g <= t && g <= c) {
            low = g;
        }
        
       points = (int) ((int) Math.pow(t,2) + Math.pow(c,2) + Math.pow(g,2) + low * 7);
       System.out.println(points);
}
}