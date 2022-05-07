package Stack;

class ArrayStack {
    int data[];
    int top;

    ArrayStack(int n) {
        data = new int[n];
        top = 0;
    }

    public int length() {
        return top;
    }

    public Boolean isEmpty() {
        return top == 0;
    }

    public Boolean isFull() {
        return top == data.length;
    }

    public void push(int e) {
        if (isFull()) {
            System.out.println("List is full");
        } else {
            data[top] = e;
            top = top + 1;
        }
    }

    public int pop() {
        if (isFull()) {
            System.out.println("List is full");
            return -1;
        } else {
            int t = data[top - 1];
            top = top - 1;
            return t;
        }
    }

    public int peek() {
        if (isFull()) {
            System.out.println("List is full");
            return -1;
        } else {
            int t = data[top - 1];
            return t;
        }
    }



    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(data[i]+" ");
        }
    }
}

    public class StackMain {
        public static void main(String[] args) {
            ArrayStack arr = new ArrayStack(5);
            arr.push(6);
            arr.push(5);
            arr.push(7);
            arr.push(8);

             System.out.println(arr.pop());
            System.out.println("The element peeked is: "+arr.peek());
            arr.display();
        }
    }

