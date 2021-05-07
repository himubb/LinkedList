
public class Main {
    public static void main(String args[]){
        LinkedList list =new LinkedList();
        list.insert(5);
        list.insert(6);
        list.insert(-40);
        list.insert(7);
        list.enqueue(4);
        list.show();
        list.insertAt(3,0);
        list.show();
        list.insertAt(8,4);
        list.show();
        list.insertAt(-1,3);
        list.show();
        list.insertAt(22,2);
        list.show();
        list.delete(2);
        list.show();
        list.deleteValue(-1);
        list.show();
        list.insert(-40);
        list.show();
        list.deleteValue(-40);
        list.show();

    }

}
