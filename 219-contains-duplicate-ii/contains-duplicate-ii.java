class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
    //  HashMap<Integer, Integer> saw = new HashMap<>();
    //  for(int i=0; i<nums.length; i++){
    //     int val=nums[i];
    //     if(saw.containsKey(val) && i-saw.get(val) <=k){
    //         return true;
    //     }
    //     saw.put(val, i);
    //  }   
    //  return false;

        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;

    }
}