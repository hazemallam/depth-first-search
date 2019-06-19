



public class Stack {
    private final int SIZE = 20;
    private int [] stk;
    private int top;
    public Stack(){
        stk = new int [SIZE];
        top = -1;
    }
    public void push(int j){
        stk[++top]=j;
    }
    public int pop(){
        return stk[top--];
    }
    public int peek(){
        return stk[top];
    }
    public boolean isEmpty(){
        return top == -1;
    }
}
