class Solution {
    public long maxSumTrionic(int[] nums) {
        int n= nums.length;
        long INF= Long.MIN_VALUE/2;

        long dp[][]= new long[n+1][4];

        //define the base condition transition 
        /* if(i==n) {
            if(state==3) return 0;
            return INF;
        }*/
        for(int state=0;state<4;state++){
            dp[n][state]= (state==3)?0:INF;
        }

        //earlier we moved from 0 to n, but now in tabulation ekdm ulta 
        for(int i=n-1;i>=0;i--){
            dp[i][0]=INF;
            if(i+1<n && nums[i]<nums[i+1])
                dp[i][0]= nums[i]+dp[i+1][1];

            dp[i][1]=INF;
            if(i+1<n && nums[i]<nums[i+1])
                dp[i][1]= Math.max(dp[i][1],nums[i]+dp[i+1][1]);
            if(i+1<n && nums[i]>nums[i+1])
                dp[i][1]= Math.max(dp[i][1],nums[i]+dp[i+1][2]);

            
            dp[i][2]=INF;
            if(i+1<n && nums[i]>nums[i+1])
                dp[i][2]= Math.max(dp[i][2],nums[i]+dp[i+1][2]);
            
            if(i+1<n && nums[i]<nums[i+1])
                dp[i][2]= Math.max(dp[i][2],nums[i]+dp[i+1][3]);

            dp[i][3]= nums[i];
            if(i+1<n && nums[i]<nums[i+1])
                dp[i][3]= Math.max(dp[i][3],nums[i]+dp[i+1][3]);

        }
        long ans= INF;

        for(int i=0;i<n;i++)
            ans= Math.max(ans,dp[i][0]);

        return ans;

    }
}