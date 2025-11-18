class Solution {
    public int nextGreaterElement(int n) {
        char arr[] =(Integer.toString(n)).toCharArray();
        int i=arr.length-2;
        while(i >= 0 && arr[i] >= arr[i+1]){
            i--;
        }
        if(i== -1 ) return -1;
        int k= arr.length-1;
        while(k >= 0 && arr[i] >= arr[k]){
            k--;
        }
        swap(arr, k, i);
        StringBuilder sb = new StringBuilder();
        for(int j=0;j<=i;j++){
            sb.append(arr[j]);
        }
        for(int j=arr.length-1;j>i;j--){
            sb.append(arr[j]);
        }
        long ans=Long.parseLong(sb.toString());
        return (ans <= Integer.MAX_VALUE) ? (int)ans : -1;
    }
    public void swap(char arr[], int i, int k){
        char temp=arr[k];
        arr[k]=arr[i];
        arr[i]=temp;
    }
}