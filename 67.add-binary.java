/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry=0;
        while(i>=0||j>=0){
            int sum=0;
            if(i>=0){
                sum += a.charAt(i--)-'0';
            }
            if(j>=0){
                sum += b.charAt(j--)-'0';
            }
            sum+=carry;
            result.append(sum%2);
            carry = sum>1 ? 1:0;
        }
        if(carry!=0) result.append(carry);
        return result.reverse().toString();
    }
}
// @lc code=end

