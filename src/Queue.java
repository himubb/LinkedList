public class Queue {
    int queue[];
    int size;
    int head;
    int tail;
    int capacity;
    Queue(int cap){
        queue=new int[cap];
        size=0;
        capacity=cap;
    }
    public void enqueue(int data){
        if(!isFull()){
            queue[tail]=data;
            tail=(tail+1)%capacity;
            size++;
        }
        else
        {
               System.out.println("Queue is full");

        }

    }
    public int dequeue(){
        if(!isEmpty()){
            int data = queue[head];
            head=(head+1)%capacity;
            size--;
            return data;
        }
        else
        {
            System.out.println("Queue is empty");
        }
        return -1;

    }
    public void show(){
        for(int i=0;i<size;i++){
            System.out.print(queue[(head+i)%capacity]+" ");
        }
        System.out.println("");
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==capacity;
    }
}
