class Solution {
    public int[] runningSum(int[] nums) {
    
        int res=0;
         for(int i=0;i<nums.length;i++){
            res=res+nums[i];
            nums[i]=res;
         }
         return nums;
    }
}