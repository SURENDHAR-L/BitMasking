import java.util.*;
// 111524202055 Surendhar L
class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    // public MinStack(){
    //     stack = new Stack<>();
    // }
    List<Integer> list;
    int min;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            minStack.push(value);
        }else{
            if(value < minStack.peek()){
                minStack.push(value);
            }else{
                minStack.push(minStack.peek());
            }
        }
        stack.push(value);
    }
    
    public void pop() { 
        minStack.pop();
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */