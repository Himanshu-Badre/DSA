class Solution {
    public int[] productExceptSelf(int[] nums) {
        int leftProduct=1;
        int rightProduct=1;
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            result[i] = leftProduct;
            leftProduct= leftProduct * nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            result[i]=result[i] * rightProduct;
            rightProduct= rightProduct * nums[i];
        }
        return result;
    }
}