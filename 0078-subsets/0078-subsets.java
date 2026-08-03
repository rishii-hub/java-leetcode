class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;

        List<List<Integer>> list = new ArrayList<>();

        for(int mask = 0; mask < (1 << n) ; mask++){
            List<Integer> currSet = new ArrayList<>();

            for(int j = 0; j < n; j++){
                if((mask & (1 << j)) != 0 ){
                    currSet.add(nums[j]);
                }
            }
            list.add(currSet);

        }
        return list;
    }
}