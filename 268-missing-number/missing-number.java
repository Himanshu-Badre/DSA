class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i) {
                continue;
            } else if (nums[i] != i) {
                return i;
            }
        }
        return n+1;
    }
}