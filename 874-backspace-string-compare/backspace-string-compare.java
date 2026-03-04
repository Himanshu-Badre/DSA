class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> S = new Stack<>();      
        Stack<Character> T = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='#'){
                if(!S.isEmpty()){
                    S.pop();
                }
            }else{
                S.push(s.charAt(i));
            }
        }
        for(int i=0; i<t.length(); i++){
            if(t.charAt(i)=='#'){
                if(!T.isEmpty()){
                    T.pop();
                }
            }else{
                T.push(t.charAt(i));
            }
        }

        return S.equals(T);
    }
}