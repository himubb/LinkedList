public class LinkedList  {
    Node head;
    LinkedList(){

    }
    public void show(){
        Node node=head;
        while( node.getNext()!=null){
            System.out.print(node.getData()+" ");
            node=node.getNext();
        }
        System.out.print(node.getData());
        System.out.println(" ");


    }
    public void enqueue(int data){
        Node node=new Node();
        node.setData(data);
        node.setNext(head);
        head=node;

    }
    public void delete(int index){
        if(index==0){
            if(head==null)
                return;
            else{
                head=head.getNext();
            }

        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
           temp=temp.getNext();
        }
        Node remove=temp.getNext();
        temp.setNext(remove.getNext());
        remove=null;
    }

    public void deleteValue(int val){
        if(head.getData()==val){
                head=head.getNext();
            }
        else {
            Node temp = head;
            while (temp.getNext() != null) {

                if (temp.getNext().getData() == val) {
                    if(temp.getNext().getNext()==null){
                        Node remove = temp.getNext();
                        temp.setNext(null);
                        remove = null;
                        return;
                    }
                    else{
                        Node remove = temp.getNext();
                        temp.setNext(remove.getNext());
                        remove = null;
                    }

                }

                temp = temp.getNext();
            }
        }

    }
    public void insertAt(int data, int index){
        if(index==0){
            enqueue(data);
            return;
        }

        Node node=new Node();
        node.setData(data);
        Node temp=head;
        int count=0;
        while(count<index-1){
            temp=temp.getNext();
            count++;
        }
        node.setNext(temp.getNext());
        temp.setNext(node);



    }

    public void insert(int data){
        Node node=new Node();
        node.setData(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
        }

    }
}
