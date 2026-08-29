class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap <Character, Integer> map = new HashMap<>();
        int l = 0; 
        int maxLen = 0;

        for(int r = 0; r < s.length(); r++){
            char ch = s.charAt(r);

            //duplicate l ? jump then
            if(map.containsKey(ch)){
                l = Math.max(l , map.get(ch) + 1);
            }

            //store latest index
            map.put(ch , r);

            //update window len
            maxLen = Math.max(maxLen ,  -l + r + 1);
        }
        return maxLen;
    }
}