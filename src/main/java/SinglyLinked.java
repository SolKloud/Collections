public class SinglyLinked {
    class Node {
        int element;
        Node next;

        public Node(int e, Node n) {
            element = e;
            next = n;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinked(){
        head=null;
        tail=null;
        size=0;
    }

    //CHECKING SIZE
    public int length(){
        return size;
    }

    //CHECKING EMPTY OR NOT
    public Boolean isEmpty(){
        return size==0;
    }


    //ADDING ELEMENT AT THE LAST
    public  void addLast(int e){
        Node n1=new Node(e,null);
        if(isEmpty()){
            head=n1;
        }
        else{
            tail.next=n1;
        }
        tail=n1;
        size=size+1;
    }

    //ADDING ELEMENT AT FIRST
    public void addFirst(int e){
        Node newest =new Node(e,null);
        if(isEmpty()){
            head=newest;
            tail=newest;
        }
        else{
            newest.next=head;
            head=newest;
        }
        size=size+1;

    }


    //REMOVAL ANYWHERE FROM LIST
    public  int deleteAny(int position){
        Node p=head;
        int i=0;
        while(i<position-1){
            p=p.next;
            i=i+1;
        }
        int s=p.next.element;
        p.next=p.next.next;
        size=size-1;

        return s;
    }

    //REMOVAL FROM HEAD
    public int deleteFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
            return ' ';
        }
        int e= head.element;
        head=head.next;
        size=size-1;
        if(isEmpty()){
            tail=null;
        }
        return e;
    }

    //REMOVAL FROM TAIL
    public  int deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return ' ';
        } else {
            Node p = head;
            int i = 1;
            while (i < length() - 1) {
                p = p.next;
                i = i + 1;
            }
            tail = p;
            p = p.next;
            int t = p.element;
            tail.next = null;
            size = size - 1;

            return t;
        }
    }

    //INSERTING ANYWHERE IN THE LIST
    void addAny(int e,int position){
        Node newest=new Node(e,null);
        Node p=head;
        int i=1;
        while(i<position-1){
            p=p.next;
            i=i+1;
        }
        newest.next=p.next;
        p.next=newest;
        size=size+1;

    }

    //SEARCHING
    int search(int key){
        Node  p=head;
        int index=0;
        while(p != null){
            if(p.element == key){
                return index;
            }
            else{
                p=p.next;
                index=index+1;
            }
        }
        return -1;
    }


    public  void display(){
        Node p=head;
        while(p != null){
            System.out.println(p.element);
            p=p.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinked l=new SinglyLinked();

        //ADDING AT THE LAST
        l.addLast(2);
        l.addLast(3);
        l.addLast(4);
        l.display();
        int s=l.length();
        System.out.println("The size is:"+ s);


        //ADDING ELEMENT AT THE FIRST
//        l.addFirst(2);
//        l.addFirst(3);
//        l.addFirst(4);
//        l.display();

        //REMOVAL ANYWHERE IN THE LIST
//        int t=l.deleteAny(2);
//        System.out.println("after deletion");
//        System.out.println("The deleted node is:"+ t);
//        l.display();


        //REMOVAL AT THE FIRST OF THE LIST
//        int e=l.deleteFirst();
//        System.out.println("after deletion");
//        System.out.println("The deleted node is:"+ e);
//        l.display();

        //REMOVAL AT THE LAST OF THE LIST
//        int t=l.deleteLast();
//        System.out.println("after deletion");
//        System.out.println("The deleted node is:"+ t);
//        l.display();


        //INSERTING ANYWHERE IN THE LIST
//        l.addAny(8,2);
//        System.out.println("after inserting");
//        l.display();
//
//        s=l.length();
//        System.out.println("The size is:"+ s);

        //SEARCHING
//        int t=l.search(5);
//        System.out.println("after searching");
//        if(t == -1){
//            System.out.println("the searched node is not found");
//        }
//        else {
//            System.out.println("The searched node is at index" + t);
//        }



    }
}
