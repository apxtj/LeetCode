/*
 * @lc app=leetcode id=9 lang=golang
 *
 * [9] Palindrome Number
 */

// @lc code=start
func isPalindrome(x int) bool {
    var reversedNum int
	if x<0||(x%10==0&&x!=0){
		return false
	}
	for x>reversedNum{
		reversedNum = reversedNum*10+x%10
		x=x/10
	}
	return x==reversedNum||x==reversedNum/10
}
// @lc code=end

