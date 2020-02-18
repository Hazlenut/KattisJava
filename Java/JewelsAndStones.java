//https://leetcode.com/problems/jewels-and-stones/submissions/
import java.util.*;
class Solution {
    public int numJewelsInStones(String J, String S) {
        int j = 0;
        List<Character> list = new ArrayList<Character>();
        for(int i = 0; i < J.length(); i++) {
            list.add(J.charAt(i));
        }
        for(int i = 0; i < S.length(); i++) {
            if(list.contains(S.charAt(i))) {
                j++;
            }
        }
        return j;
    }
}
