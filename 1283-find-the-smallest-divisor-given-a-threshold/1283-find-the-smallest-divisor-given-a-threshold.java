class Solution {

    private int sum(int[] nums, int div){
        int total = 0;

        for(int n : nums){
            total += (n + div - 1)/div;
        }
        return total;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = 0;

        for(int n : nums){
            high = Math.max(high , n);
        }

        int ans = high;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(sum(nums,mid) <= threshold){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}