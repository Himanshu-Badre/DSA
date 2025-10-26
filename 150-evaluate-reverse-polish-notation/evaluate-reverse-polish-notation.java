class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<tokens.length; i++){
          if(tokens[i].equals("+")){
            int top=stack.pop();
            int secondTop=stack.pop();
            int result= top+secondTop;
            stack.push(result);
          }else if(tokens[i].equals("-")){
            int top=stack.pop();
            int secondTop= stack.pop();
            int result= secondTop-top;
            stack.push(result);
          }else if(tokens[i].equals("*")){
            int top= stack.pop();
            int secondTop= stack.pop();
            int result= top*secondTop;
            stack.push(result);
          }else if(tokens[i].equals("/")){
            int top= stack.pop();
            int secondTop=stack.pop();
            int result=secondTop/top;
            stack.push(result);
          }else{
            int num= Integer.parseInt(tokens[i]);
            stack.push(num);
          }
        }
        return stack.pop();
    }
}