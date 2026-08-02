class Solution {

    private int gcd(int x , int y){
        while(y!=0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public long maxPairStrength(int[] nums) {
        long ans = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length ; j++){
                long gcd = gcd(nums[i] , nums[j]);
                long strength = (1L * nums[i] * nums[j]) / (gcd * gcd);

                ans = Math.max(ans , strength);
            }
        }
        return ans;
    }
}