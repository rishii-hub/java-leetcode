class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int digits = 0;
        while(n > 0){
            digits = n % 10;
            arr.add(digits);
            n /=10;
        }
        int big = 0;
        int big2 = 0;

        for(int n1 : arr){
            if( n1 > big){
                big2 = big;
                big = n1;
            }
            else if(n1 > big2){
                big2 = n1;
            }
        }
        return big*big2;
    }
}