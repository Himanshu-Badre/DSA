class Solution {
    public int thirdMax(int[] nums) {
        long maxNum=Long.MIN_VALUE;
        long secondMax=Long.MIN_VALUE;
        long thirdMax=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int val=nums[i];
            if(val==maxNum || val == secondMax || val == thirdMax){
                continue;
            }
            if(val> maxNum){
                thirdMax=secondMax;
                secondMax=maxNum;
                maxNum=val;
            }else if(val > secondMax){
                thirdMax=secondMax;
                secondMax=val;
            }else if(val> thirdMax){
                thirdMax=val;
            }
        }
        return thirdMax==Long.MIN_VALUE ? (int) maxNum : (int) thirdMax;
    }
}