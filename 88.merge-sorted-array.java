/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp=0;
        for(int i=0; i<n; i++){
            nums1[i+m]+=nums2[i];
        }
        for(int i=1; i<nums1.length; i++){
            while(nums1[i-1]>nums1[i]){
                temp=nums1[i-1];
                nums1[i-1]=nums1[i];
                nums1[i]=temp;
                i--;
                if(i==0)break;
            }
        }
    }
}

// @lc code=end

