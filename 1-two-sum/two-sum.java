class Solution {
    // public int[] twoSum(int[] nums, int target) {
    //     for(int i=0; i<nums.length; i++){
    //         for(int j=i+1; j<nums.length; j++){
    //             if(nums[i] + nums[j]== target){
    //                 return new int[] {i, j};
    //             }
    //         }
    //     }
    //     return new int[] {};
    // }

    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            int complement= target-num;
            if(map.containsKey(complement)){
                int index1=map.get(complement);
                int index2=i;
                return new int[] {index1, index2};
            }else{
                map.put(num, i);
            }
        }
        return new int[] {};
    }
}