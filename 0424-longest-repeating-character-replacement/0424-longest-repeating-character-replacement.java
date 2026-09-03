class Solution {
    public int characterReplacement(String s, int k) {
       int left = 0;
       int maxFreq = 0;
       int maxLen = 0;

       HashMap <Character , Integer> map = new HashMap<>();

       for(int right = 0; right < s.length() ; right++){
            char ch = s.charAt(right);
            
            //add current char
            map.put(ch , map.getOrDefault(ch , 0) + 1);

            //maxFreq
            maxFreq = Math.max(maxFreq , map.get(ch));
            
            //replacement
            int rep = (right - left + 1) - maxFreq;

            if(rep > k){
                char leftChar = s.charAt(left);
                map.put(leftChar , map.get(leftChar)- 1);
                left++;
            }
            maxLen = Math.max(maxFreq , right - left + 1);
       } 
       return maxLen;
    }
}