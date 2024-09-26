/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[n*2];
        for(int i=0; i<n; i++){
            int x = nums[i];
            int y = nums[i+n];
            result[i*2] = x;
            result[i*2+1] = y;
        }
        return result;
    }
}
// @lc code=end

