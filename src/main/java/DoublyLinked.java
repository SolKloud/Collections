public class DoublyLinked {
    class Node {
        int element;
        Node next;
        Node prev;
        public Node(int e, Node n,Node p) {
            element = e;
            next = n;
            prev=p;

        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinked(){
        head=null;
        tail=null;
        size=0;
    }

    public int length(){
        return size;
    }

    public Boolean isEmpty(){
        return size==0;
    }


    //ADDING AT THE LAST
    public void addLast(int e){
        Node n1=new Node(e,null,null);
        if(isEmpty()){
            head=n1;
        }
        else{
            tail.next=n1;
            n1.prev=tail;
        }
        tail=n1;
        size=size+1;
    }

    //ADDING ANYWHERE IN THE LIST
    public void addAny(int e,int position){
        Node newest=new Node(e,null,null);
        Node p=head;
        int i=1;
        while(i<position-1){
            p=p.next;
            i=i+1;
        }
        p.next.prev=newest;
        newest.next=p.next;
        newest.prev=p;
        p.next=newest;
        size=size+1;

    }

    //ADDING AT THE FIRST
    public void addFirst(int e){
        Node n1=new Node(e,null,null);
        if(isEmpty()){
            head=n1;
            tail=n1;
        }
        else{
            n1.next=head;
            head.prev=n1;
            head=n1;
        }
        size=size+1;

    }

    //REMOVAL AT THE FIRST
    public int removeFirst(){
        if(isEmpty()){
            System.out.println("List is empty");
            return ' ';
        }
        int e= head.element;
        head=head.next;
        size=size-1;

        if(isEmpty()){
            tail=null;
        }
        else{
            head.prev=null;
        }
        return  e;
    }

    //REMOVAL ANYWHERE IN THE LIST
    public int removeAny(int position){
        Node p=head;
        int i=1;
        while(i<position-1){
            p=p.next;
            i=i+1;
        }
        int e=p.next.element;
        p.next=p.next.next;
        p.next.prev=p;
        size=size-1;
        return e;
    }

    //REMOVAL LAST IN THE LIST
    public int removeLast(){
        if(isEmpty()){
            System.out.println("List is empty");
            return ' ';
        }
        int e= tail.element;
        tail=tail.prev;
        size=size-1;

        if(isEmpty()){
            head=null;
        }
        else{
            tail.next=null;
        }
        return  e;
    }


    public  void display(){
        Node p=head;
        while(p!=null){
            System.out.println(p.element);
            p=p.next;
        }
    }

    public static void main(String[] args) {
        DoublyLinked l=new DoublyLinked();

        //ADDING AT THE LAST
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.addLast(9);
        l.addLast(10);
        l.display();

        int s=l.length();
        System.out.println("The size is:"+ s);


        //ADDING ANYWHERE IN THE LIST
//        l.addAny(10,2);
//        l.display();

        //ADDING AT FIRST IN THE LIST
//        l.addFirst(2);
//        l.addFirst(3);
//        l.addFirst(4);
//        l.addFirst(9);
//        l.addFirst(10);
//        l.display();

        //REMOVAL FIRST IN THE LIST
//        System.out.println("After removing");
//        l.removeFirst();
//        l.display();


        //REMOVAL ANYWHERE IN THE LIST
//        System.out.println("After removing");
//        l.removeAny(4);
//        l.display();


        //REMOVAL AT LAST IN THE LIST
//        System.out.println("After removing");
//        l.removeLast();
//        l.display();
    }



}
