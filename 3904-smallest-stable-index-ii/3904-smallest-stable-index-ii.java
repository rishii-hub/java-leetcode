class Solution {
    public int firstStableIndex(int[] nums, int k) {

        int n = nums.length;

        int[] suffixMin = new int[n];

        suffixMin[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], nums[i]);
        }

        int maxx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            maxx = Math.max(maxx, nums[i]);

            int score = maxx - suffixMin[i];

            if (score <= k) {
                return i;
            }
        }

        return -1;
    }
}