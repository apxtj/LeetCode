/*
 * @lc app=leetcode id=1 lang=golang
 *
 * [1] Two Sum
 */

// @lc code=start
func twoSum(nums []int, target int) []int {
    indexMap := make(map[int]int)
	for currIndex, currNum := range nums{
		if requiredIndex, isPresent := indexMap[target-currNum]; isPresent{
			return []int {requiredIndex, currIndex}
		}
		indexMap[currNum] = currIndex
	}
	return []int{}
}
// @lc code=end

