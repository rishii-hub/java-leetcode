class Solution {

    private int countB(int[] bloomDat , int days, int k){
        int bouq = 0;
        int flws = 0;

        for(int bloom : bloomDat){
            if(bloom <= days)
            {
                flws++;
                if(flws == k){
                    bouq++;
                    flws = 0;
                }
            }
            else{
                    flws = 0;
                }
        }
        return bouq;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if( (long) m * k > bloomDay.length){
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for (int day : bloomDay) {
    low = Math.min(low, day);
    high = Math.max(high, day);
}
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;

            if(countB(bloomDay , mid , k) >= m){
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