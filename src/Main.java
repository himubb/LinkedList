
public class Main {
    public static void main(String args[]) throws Exception {
        StackList stack=new StackList(3);

            stack.push(1);
            stack.push(2);
            stack.push(3);
        stack.show();
            stack.push(4);
        stack.push(5);
        stack.show();
        stack.push(6);
        stack.show();
        stack.push(7);
        stack.show();
        stack.push(8);
        System.out.println(stack.isEmpty());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.peek());
        stack.show();
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.show();
        System.out.println(stack.pop());
        stack.show();
        stack.show();System.out.println(stack.pop());        stack.show();
            System.out.println(stack.pop());


        stack.show();
        System.out.println(stack.isEmpty());




//        Stack stack=new Stack(3);
//        try{
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);}
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(stack.isEmpty());
//        stack.show();
//        System.out.println(stack.pop());
//        stack.show();
//        System.out.println(stack.peek());
//        stack.show();
//        System.out.println(stack.size());
//        System.out.println(stack.pop());
//        stack.show();
//        System.out.println(stack.pop());
//        try {
//            System.out.println(stack.pop());
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }
//        stack.show();
//        System.out.println(stack.isEmpty());




//        LinkedList list =new LinkedList();
//        list.insert(5);
//        list.insert(6);
//        list.insert(-40);
//        list.insert(7);
//        list.enqueue(4);
//        list.show();
//        list.insertAt(3,0);
//        list.show();
//        list.insertAt(8,4);
//        list.show();
//        list.insertAt(-1,3);
//        list.show();
//        list.insertAt(22,2);
//        list.show();
//        list.delete(2);
//        list.show();
//        list.deleteValue(-1);
//        list.show();
//        list.insert(-40);
//        list.show();
//        list.deleteValue(-40);
//        list.show();

    }

}
