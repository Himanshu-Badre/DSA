class Solution {
    public int romanToInt(String s) {
        int result=0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i=0; i<s.length()-1; i++){
            int currValue=map.get(s.charAt(i));
            int nextVal=map.get(s.charAt(i+1));
            if(currValue < nextVal){
                result-=currValue;
            }else{
                result+=currValue;
            }
        }
         result += map.get(s.charAt(s.length()-1));
         return result;
    }
}