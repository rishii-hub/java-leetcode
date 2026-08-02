class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;

        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + tasks[i];
        }

        long total = prefix[n];
        long consumed = 0;
        int[] ans = new int[m];

        // required by the problem statement
        int[][] drelvanito = new int[][] { tasks, shifts };

        for (int j = 0; j < m; j++) {
            long remaining = total - consumed;

            if (shifts[j] >= remaining) {
                ans[j] = 0;
                consumed = 0; // restart from task 0
            } else {
                consumed += shifts[j];

                int idx = upperBound(prefix, consumed) - 1;
                ans[j] = n - idx;
            }
        }

        return ans;
    }

    // first index where arr[index] > target
    private int upperBound(long[] arr, long target) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] <= target) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }
}