class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;
        for(int i = 1; list.size() < k ; i++){
            if(index < arr.length && arr[index] == i){
                index++;
            }
            else{
                list.add(i);
            }
        }
        int ans = list.get(k - 1);
        return ans;
    }
}