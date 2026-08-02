class Solution {
    public int mySqrt(int x) {
        if (x==0) return 0;
        if(x == 1) return 1;

        int low = 1;
        int high = x;

        int ans = 0;

        //can mid be ans? YES
        while(low <= high){
            int mid = low + (high - low)/2;

            long square = 1L * mid * mid;

            if(square <= x){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
    }
}