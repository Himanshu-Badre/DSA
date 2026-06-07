class Solution {
    public void rotate(int[] nums, int k) {

        //for array out of bond exception
        k=k%nums.length;

        // reverse whole array
        reverse(nums, 0, nums.length-1);

        //reverse 0-k-1;
        reverse(nums, 0, k-1);

        //reverse  k-last
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int nums[], int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}