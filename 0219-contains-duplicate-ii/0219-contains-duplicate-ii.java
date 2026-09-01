class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length == 0){
            return false;
        }
        int left = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int right = 0; right < nums.length; right++){
            //window contains prev k elements
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);
            //slide the window
            if(right - left >= k){
                set.remove(nums[left]);
                left++;
            }
        }
        return false;
    }
}