class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
            String token1 = tokens[i];
            if(token1.equals("+") || token1.equals("-") || token1.equals("*") || token1.equals("/")){
                int a=stack.pop();
                int b=stack.pop();
                if(token1.equals("+")){
                    int result=b+a;
                    stack.push(result);
                }
                if(token1.equals("-")){
                    int result=b-a;
                    stack.push(result);
                }
                if(token1.equals("*")){
                    int result=b*a;
                    stack.push(result);
                }
                if(token1.equals("/")){
                    int result=b/a;
                    stack.push(result);
                }
            }else{
                stack.push(Integer.parseInt(token1));
            }
        }
        return stack.pop();
    }
}