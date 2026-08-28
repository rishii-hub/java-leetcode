class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int size = cardPoints.length - k;
        int totalSum = 0;
        for (int x : cardPoints){
            totalSum += x;
        }

        //make first window
        int sum = 0; int i = 0; int j = 0;
        while(j < size){
            sum +=cardPoints[j];
            j++;
        }

        //slide window now
        int minSum = sum;
        while( j < cardPoints.length){
            sum += cardPoints[j];
            sum -= cardPoints[i];
            minSum = Math.min(minSum , sum);
            i++; j++;
        }
        return totalSum - minSum;
    }
}