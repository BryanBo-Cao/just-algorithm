package ladders.USGiants.l4_MathAndBitManipulation.num140_FastPower;

public class Solution_FromOther {
    /*
     * @param a, b, n: 32bit integers
     * @return: An integer
     */
    public int fastPower(int a, int b, int n) {
        // write your code here
        if (n == 1) {
            return a % b;
        }
        if (n == 0) {
            return 1 % b;
        }
        
        long product = fastPower(a, b, n / 2);
        product = (product * product) % b;
        if (n % 2 == 1) {
            product = (product * a) % b;
        }
        return (int) product;
    }
}
//http://www.lintcode.com/en/problem/fast-power/
/*
Fast Power

 Description
 Notes
 Testcase
 Judge
Calculate the an % b where a, b and n are all 32bit integers.

Have you met this question in a real interview? Yes
Example
For 231 % 3 = 2

For 1001000 % 1000 = 0

Challenge 
O(logn)

Tags 
Divide and Conquer
Related Problems 
Medium Pow(x, n)
*/
//From http://www.jiuzhang.com/solutions/fast-power/
