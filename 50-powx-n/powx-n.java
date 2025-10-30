class Solution {
    public double myPow(double x, int n) {
    //     double result=1;
    //     if(n==0){
    //         return 1;
    //     }else if(n>0){
    //         for(int i=1; i<=n; i++){
    //             result=result*x;
    //         }
    //     }else if(n<0){
    //         n=-n;
    //         for(int i=1; i<=n; i++){
    //             result=result*x;
    //         }
    //         result=1/result;
    //     }
    //     return result;

        long power=n;// use long to handle Integer.MIN_VALUE correctly
        if(power<0){
            x=1/x;
            power=-power;
        }
        double result=1;
        while(power>0){
            //if power is odd, multiple it by x
            if((power & 1)==1){
                result=result*x;
            }
            // square rooot of next bit
            x=x*x;
            // shift power right by 1 (divide by 2)
            power>>=1;
        }
        return result;
    }
}