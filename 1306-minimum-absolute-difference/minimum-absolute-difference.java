class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>>res=new ArrayList();
      int len=arr.length;
      int min=1000000;
      Arrays.sort(arr);
      for(int i=0;i<len-1;i++){
        min=Math.min(arr[i+1]-arr[i],min);
    } 
    for(int i=0;i<len-1;i++){
        if(arr[i+1]-arr[i]==min){
         ArrayList<Integer>list= new ArrayList<>();
         list.add(arr[i]);
         list.add(arr[i+1]);
         res.add(list);

        }
    }
    return res;
    }
}