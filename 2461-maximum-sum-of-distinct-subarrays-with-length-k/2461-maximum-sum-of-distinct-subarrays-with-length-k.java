import java.util.*;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int l = 0;
        long sum = 0;
        long maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int r = 0; r < nums.length; r++) {

            // Add right element
            sum += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Keep window size k
            if (r >= k) {
                sum -= nums[l];

                map.put(nums[l], map.get(nums[l]) - 1);

                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }

                l++;
            }

            // All k elements are distinct
            if (r - l + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}