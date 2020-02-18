//https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
class Solution {
    public int subtractProductAndSum(int n) {
        String s = Integer.toString(n);
        int product = 1, sum = 0;
        for(int i = 0; i < s.length(); i++) {
            int k = s.charAt(i)-48;
            product *= k;
            sum += k;
        }
        return product -sum;
    }
}

/* Alternate Solution
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1, sum = 0;
        while (n> 0) {
            product *= n%10;
            sum += n%10;
            n/=10;
        }
        return product -sum;
    }
}
*/
