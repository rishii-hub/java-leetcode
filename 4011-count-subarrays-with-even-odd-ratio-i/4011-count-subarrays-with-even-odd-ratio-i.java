class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int ans = 0;
        int[] cloned = nums;

        int n = cloned.length;

        for(int i = 0; i < n ; i++){
            int even = 0;
            int odd = 0;

            for(int j = i ; j < n ; j++){
                if(cloned[j] % 2 == 0){
                    even++;
                }
                else {
                    odd++;
                }

                if( odd > 0 && 1L * even * b <= 1L * odd * a){
                    ans++;
                }
            }
        }
        return ans;
        
    }
}