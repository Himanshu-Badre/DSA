class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        long total =(long)n*n;
        long sumExp=total*(total+1)/2;
        long sumSquare=total * (total+1) * (2* total +1)/6;
        long actualSum=0;
        long actualSquareSum=0;
        for(int[] row: grid){
            for(int num : row){
                actualSum +=num;
                actualSquareSum+=(long)num*num;
            }
        }
        long diff=actualSum-sumExp;
        long SquareDiff=actualSquareSum-sumSquare;
        long sum= SquareDiff/diff;
        long a=(diff+sum)/2;
        long b= a-diff;

        return new int[] {(int)a, (int)b};
    }
}