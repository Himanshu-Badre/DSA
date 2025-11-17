class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int[] result = new int[n];
        int end=n-1;
        int mid=(n-1)/2;
        int i=0, j=1;
        while(j < n){
            result[j]=nums[end];
            end--;
            j+=2;
        }
        while(i < n){
            result[i]=nums[mid];
            mid--;
            i+=2;
        }
        for(int k=0; k<n; k++){
            nums[k]=result[k];
        }
    }
}