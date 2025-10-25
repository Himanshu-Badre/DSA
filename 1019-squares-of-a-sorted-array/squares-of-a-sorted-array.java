class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;
        int[] result = new int[nums.length];
        while (left <= right) {
            int leftVal = nums[left] * nums[left];
            int rightVal = nums[right] * nums[right];

            if(leftVal > rightVal) {
                result[index] = leftVal;
                left++;
            }else{
                    result[index] = rightVal;
                    right--;
                }
                index--;
        }
        return result;
    }
}