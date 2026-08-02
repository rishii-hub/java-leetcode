class Solution {
    public int heightChecker(int[] heights) {
        int[] cloned = heights.clone();
        Arrays.sort(cloned);
        int cnt = 0;
        for(int i = 0; i < heights.length; i++){
            if(cloned[i] != heights[i]){
                cnt++;
            }
        }
        return cnt;
    }
}