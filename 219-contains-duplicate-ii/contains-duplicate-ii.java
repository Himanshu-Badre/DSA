class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer, Integer> saw = new HashMap<>();
     for(int i=0; i<nums.length; i++){
        int val=nums[i];
        if(saw.containsKey(val) && i-saw.get(val) <=k){
            return true;
        }
        saw.put(val, i);
     }   
     return false;
    }
}