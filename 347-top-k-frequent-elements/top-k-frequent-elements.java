class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0) +1);
        }
        List<Integer>[] buckets= new List[nums.length+1];
        for(int i=0; i<= nums.length; i++){
            buckets[i]=new ArrayList<>();
        }
        for(int num: map.keySet()){
            int freq= map.get(num);
            buckets[freq].add(num);
        }
        List<Integer> result= new ArrayList<>();
        for(int i=buckets.length-1; i>=0 && result.size()<k; i--){
            if(!buckets[i].isEmpty()){
                result.addAll(buckets[i]);
            }
        }
        int[] res=new int[k];
        for(int i=0; i<k; i++){
            res[i]=result.get(i);
        }
        return res;
    }
}