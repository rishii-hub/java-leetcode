class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] hash = new int[nums.length + 1];

        //intialise hashing
        for(int i = 0; i < nums.length ; i++){
            hash[nums[i]]++;
        }

        List<Integer> ans = new ArrayList<>();  
        for(int i = 1; i <= nums.length; i++){
            if(hash[i] == 0){
                ans.add(i);
            }

        }
        return ans;
    }
}