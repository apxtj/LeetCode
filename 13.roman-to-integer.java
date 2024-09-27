/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int result = 0;

        for(int i=0; i<s.length(); i++){
            int next = (i+1<s.length()) ? map.get(s.charAt(i+1)) : 0;
            int current = map.get(s.charAt(i));
            if(current < next){
                result -= current;
            }else{
                result += current;
            }
        }
        return result;
    }
}
// @lc code=end

