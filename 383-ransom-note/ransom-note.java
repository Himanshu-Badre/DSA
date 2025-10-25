class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count= new int[26];
        for(char c: magazine.toCharArray()){
            int index= c- 'a';
            count[index]+=1;
        }
        for(char c: ransomNote.toCharArray()){
           int index=c-'a';
            count[index]-=1;
            if(count[index]<0){
                return false;
            }
        }
        return true;
    }
}