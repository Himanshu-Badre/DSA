class Solution {
    public int maxSubArray(int[] nums) {
        // int currentSum=nums[0];
        // int maxSum=nums[0];
        // for(int i=1; i<nums.length; i++){
        //     currentSum=Math.max(nums[i], currentSum+nums[i]);
        //     maxSum=Math.max(maxSum, currentSum);
        // }
        // return maxSum;

        int ans=nums[0];
        int prefix=0;
        int n= nums.length;
        for(int i=0; i<n; i++){
            prefix+=nums[i];
            ans=Math.max(ans, prefix);
            if(prefix<0){
                prefix=0;
            }
        }
        return ans;
    }
}