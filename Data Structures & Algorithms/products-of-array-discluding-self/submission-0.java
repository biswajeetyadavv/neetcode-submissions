class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] sufix = new int[len];
        int[] arr = new int[len];

        prefix[0] = 1;
        for(int i = 1; i< nums.length; i++){
            // if(nums[i] != 0){
                prefix[i] = nums[i-1] * prefix[i-1];
            // }
        }

        sufix[len-1] = 1;
        for(int i = len -2; i>= 0; i--){
            // if(nums[i] !=0){
                sufix[i] = nums[i+1] * sufix[i+1];
            // }
        }

        for(int i = 0; i< nums.length; i++){
            arr[i] = prefix[i] * sufix[i];
        }
        

        return arr;
    }
}  
