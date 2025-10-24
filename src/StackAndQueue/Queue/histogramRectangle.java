package StackAndQueue.Queue;

import java.util.Stack;

public class histogramRectangle {

    public static int largestRectangleArea(int[] heights) {
        if(heights.length == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        stack.push(0);

        for (int i = 1; i < heights.length; i++) {
            while(!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                maxArea = getMaxArea(heights, stack, maxArea, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while(!stack.isEmpty()){
            maxArea = getMaxArea(heights, stack, maxArea, i);
        }

        return maxArea;
    }

    private static int getMaxArea(int[] arr, Stack<Integer> stack, int maxArea, int i) {
        int area;
        int popped = stack.pop();
        if(stack.isEmpty()){
            area = arr[popped] * i;
        } else{
            area = arr[popped] * (i - 1 - stack.peek());
        }

        return Math.max(maxArea, area);
    }


    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int overallMaxArea = largestRectangleArea(heights);
        System.out.println("The largest area is : " + overallMaxArea);
    }
}
