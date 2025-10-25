class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea=0;
        for(int i=0; i<heights.length; i++){
            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
               int top= stack.pop();
                int height=heights[top];
                int width;
                if(stack.isEmpty()){
                    width=i;
                }else{
                    width=i-stack.peek()-1;
                }
                int area= height*width;
                maxArea=Math.max(maxArea, area);
            }
                stack.push(i);
        }
        int n=heights.length;
        while(!stack.isEmpty()){
            int top= stack.pop();
            int height=heights[top];
            int width=stack.isEmpty() ? n : n-stack.peek()-1;
            int area = height*width;
            maxArea=Math.max(maxArea, area);
        }
        return maxArea;
    }
}