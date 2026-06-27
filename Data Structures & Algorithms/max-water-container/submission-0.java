class Solution {
    public int maxArea(int[] arr) {
        int max = 0;
        int l = 0;
        int r = arr.length-1;

        while(l<r){
            int cal = Math.min(arr[l], arr[r])*(r-l);
            max = Math.max(max, cal);

            if(arr[l] < arr[r]){
                l++;
            }
            else{
                r--;
            }
        }
        
        return max;
    }
}
