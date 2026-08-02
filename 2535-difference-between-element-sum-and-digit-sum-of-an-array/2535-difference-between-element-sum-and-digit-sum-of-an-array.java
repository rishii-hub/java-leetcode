class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < nums.length ; i++){
            sum1 += nums[i];
        }

        //digit sum
        int dig = 0;

        for(int i = 0; i < nums.length ; i++){
            while(nums[i] > 0){
                dig = nums[i] % 10;
                sum2 += dig;
                nums[i] /= 10;
            }
        }
        int diff = Math.abs(sum1 - sum2);
        return diff;
    }
}