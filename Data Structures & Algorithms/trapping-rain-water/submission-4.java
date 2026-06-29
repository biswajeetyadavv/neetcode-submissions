class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length -1;

        int max_l = height[0];
        int max_r = height[height.length-1];

        int sum =0;
        while(l < r){
            if(height[l] > height[r]){
                int val = max_r - height[r];
                if(val>=0){
                    sum+=val;
                    
                }
                max_r = Math.max(max_r, height[r]);
                
                r--;
            }
            else{
                int val = max_l - height[l];
                if(val>0){
                    sum+=val;
                
                }
                max_l = Math.max(max_l, height[l]);
                l++;    
            }

            
        }

        return sum;
    }
}
