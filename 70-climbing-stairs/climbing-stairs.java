class Solution {
    public int climbStairs(int n) {
        int firstStep=1;
        int secondStep=2;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        int current=0;
        for(int i=3; i<=n; i++){
             current= firstStep + secondStep;
            firstStep=secondStep;
            secondStep=current;
        }
        return current;
    }
}