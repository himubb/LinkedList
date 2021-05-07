public class Stack {
    int stack[];
    int top=0;
    int cap;

    Stack(int size){
        stack=new int[size];
        cap=size;
    }
    public void push(int data) throws Exception {
        if(top==cap)
            throw new Exception("Overflow Stack");
    stack[top]=data;
    top++;
    }
    public int pop() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Underflow Stack");
        }
        top--;
        int data=stack[top];
        stack[top]=0;
        return data;
    }
    public int peek(){
        return stack[top-1];
    }

    public void show(){
        for(int n: stack){
            System.out.print(n+" ");

        }
        System.out.println(" ");
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top==0;
    }
}
