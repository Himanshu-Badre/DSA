class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a= new int[n][n];
        int rowStart=0, rowEnd=n-1;
        int colStart=0, colEnd=n-1;
        int count=1;
        while(count <= n * n){
            for(int i=colStart; i<=colEnd && count<=n*n; i++){
                a[rowStart][i]=count;
                count++;
            }
            rowStart++;
            for(int j=rowStart; j<=rowEnd && count<=n*n; j++){
                a[j][colEnd]=count;
                count++;
            }
            colEnd--;
            for(int i=colEnd; i>=colStart && count<=n*n; i--){
                a[rowEnd][i]=count;
                count++;
            }
            rowEnd--;
            for(int j=rowEnd; j>=rowStart && count<=n*n; j--){
                a[j][colStart]=count;
                count++;
            }
            colStart++;
        }
        return a;
    }
}