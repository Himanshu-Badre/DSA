class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<operations.length; i++){
            String op= operations[i];
            if(op.equals("C")){
                stack.pop();
            }else if(op.equals("D")){
                stack.push(stack.peek()*2);
            }else if(op.equals("+")){
                int last= stack.pop();
                int secondLast=stack.peek();
                stack.push(last);
                stack.push(last+ secondLast);
            }else{
                stack.push(Integer.parseInt(op));
            }
        }
        int sum=0; 
        for(int score : stack){
            sum+=score;
        }
        return sum;
    }
}