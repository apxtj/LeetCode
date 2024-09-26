/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>(); //<文字, 出現回数>で格納
        char temp; //sから取り出した1文字を一時的に格納する

        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            hashMap.put(temp, hashMap.getOrDefault(temp, -1)+1);
            //hashMapのkeyにtempがあれば、tempに対応するvalueに+1したものを、なければkeyがtempのvalueに0をput
        }
        
        //sの前から順にhashMapの<temp, 0>を探す
        for(int i=0; i<s.length(); i++){
            temp = s.charAt(i);
            if(hashMap.get(temp)==0){
                
                return i;
            }
        }

        return -1;
    }
}
// @lc code=end

