public class StackList {
    int stack[];
    int top=0;
    int cap;

    StackList(int size){
        stack=new int[size];
        cap=size;
    }
    public void push(int data) {
        if(top==cap)
            expand();
        stack[top]=data;
        top++;
    }

    private void expand() {
        int length=size();
        int newStack[]=new int[cap*2];
        System.arraycopy(stack,0,newStack,0,length);
        stack=newStack;
        cap*=2;
    }
    private void shrink() {
        int length=size();
        if(length<=(cap/2)/2)
        {
            cap/=2;
            int newStack[]=new int[cap];
            System.arraycopy(stack,0,newStack,0,length);
            stack=newStack;
        }

    }
    public int pop() throws Exception {
        if(isEmpty())
        {
            throw new Exception("Underflow Stack");
        }
        top--;
        int data=stack[top];
        stack[top]=0;
        shrink();
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

