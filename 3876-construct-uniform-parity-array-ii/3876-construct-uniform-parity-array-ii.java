class Solution {
    public boolean uniformArray(int[] nums1) {
        int minOdd = Integer.MAX_VALUE;

        // Step 1: Find the minimum odd number
        for (int x : nums1) {
            if (x % 2 == 1) {
                minOdd = Math.min(minOdd, x);
            }
        }

        // If there are no odd numbers, it's already uniformly even
        if (minOdd == Integer.MAX_VALUE) {
            return true;
        }

        // Step 2: Look for ANY even number that breaks the rule
        for (int num : nums1) {
            // If an even number is smaller than minOdd, it's impossible to transform
            if (num % 2 == 0 && num < minOdd) {
                return false; // Fail immediately
            }
        }
        
        // If we checked everything and nothing failed, it's valid!
        return true; 
    }
}
