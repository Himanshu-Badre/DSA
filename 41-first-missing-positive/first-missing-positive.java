class Solution {
    // public int firstMissingPositive(int[] nums) {
    //     int n=nums.length;
    //     int missing=1;
    //     Arrays.sort(nums);
    //     for(int i=0; i<n; i++){
    //         if(nums[i]<=0){
    //            continue;
    //         }
    //         if(nums[i]==missing){
    //             missing++;
    //         }
    //     }
    //     return missing;
    // } it in O(n2)

    public int firstMissingPositive(int[] nums) {
        // int n=nums.length;
        // for(int i=0; i<n; i++){
        //   while(nums[i] >0 && nums[i] <= n && nums[nums[i]-1]!=nums[i]){
        //     int temp=nums[nums[i]-1];
        //     nums[nums[i]-1]=nums[i];
        //     nums[i]=temp;
        //   }
        // }
        // for(int i=0; i<n; i++){
        //     if(nums[i] != i+1){
        //         return i+1;
        //     }
        //   }
        // return n+1; 


        int n=nums.length;
        int[] temp= new int[n+2];
        for(int i=0; i<n; i++){
            if(nums[i]>=1 && nums[i]<=n+1){
                temp[nums[i]]=1;
            }
        }
        for(int i=1; i<=n+1; i++){
            if(temp[i]==0){
                return i;
            }
        }
        return n+1;
    }
}