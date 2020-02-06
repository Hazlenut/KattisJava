//https://leetcode.com/problems/maximum-69-number/
class Solution {
    public int maximum69Number (int num) {
        String s = Integer.toString(num);
        int index = -1;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '6') {
                index = i;
                break;
            }
        }
        if(index == -1) {
            return num;
        }else{
            return Integer.parseInt(s.substring(0,index) + '9' + s.substring(index+1));
        }
    }
}
