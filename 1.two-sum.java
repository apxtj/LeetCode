/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        loop:
        for(int i=0; i < nums.length; i++){
            for(int j=0; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    if(i==j){
                        continue;
                    }
                    result[0] = i;
                    result[1] = j;
                    break loop;
                }
            }
        }
        return result;
    }
}
// @lc code=end

