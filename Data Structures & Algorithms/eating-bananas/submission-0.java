class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int start = 1; 
        int end = Arrays.stream(piles).max().getAsInt();
        int res = end;

        while(start <= end){
            int mid = (start + end)/2;
            long sum = 0;
            
            for(int i = 0; i<piles.length; i++){
                sum += Math.ceil((double) piles[i] / mid);
            }

            if(sum <= h){
                res = mid;
                end = mid -1;               
            }
            else{
                start = mid+1;
            }
        }
        return res;
    }
}
