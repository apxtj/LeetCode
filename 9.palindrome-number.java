/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int l = s.length();
        for(int i=0; i<l; i++){
            if(s.charAt(i) != s.charAt(l-1-i)){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

