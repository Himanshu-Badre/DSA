class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        HashMap<Integer, Integer> occurence = new HashMap<>();
        occurence.put(0,1);
        for(int i=0; i<nums.length; i++){
            int num=nums[i];
            sum+=num;
            if(occurence.containsKey(sum-k)){
              count+= occurence.get(sum-k);
            }
            occurence.put(sum, occurence.getOrDefault(sum, 0)+ 1);
        }
        return count;
    }
}