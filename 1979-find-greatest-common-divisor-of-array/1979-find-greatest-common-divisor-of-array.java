class Solution {

    private int gcd(int x, int y){
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp; 
        }
        return Math.abs(x);
    }
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length ; i++){
            max = Math.max(nums[i] , max);
            min = Math.min(nums[i] , min);
        }

        return gcd(max , min);
    }
}