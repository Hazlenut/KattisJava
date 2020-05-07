// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class FindNumbersWithEvenNumberOfDigits {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i: nums) {
            count = (Integer.toString(i).length() % 2 == 0) ? count + 1 : count;
        }
        return count;
    }
}
