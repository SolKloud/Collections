package Stack;

public class LinkedStack {
    class Node{
        int element;
        Node next;

        Node(int e,Node n){
            element=e;
            next=n;
        }
    }

    private Node top;
    private int size;

    LinkedStack(){
        top=null;
        size=0;
    }

    public  Boolean isEmpty(){
        return size==0;
    }

    public int length(){
        return size;
    }

    public void push(int e){
        Node newest=new Node(e,null);
        if(isEmpty()){
            top=newest;
        }
        else{
            newest.next=top;
            top=newest;
        }
        size=size+1;
    }

    public void display(){
        Node p=top;
        while(p!=null){
            System.out.println(p.element);
            p=p.next;
        }
    }

    public static void main(String []args){
        LinkedStack l=new LinkedStack();
        l.push(20);
        l.push(10);
        l.display();
    }
}
