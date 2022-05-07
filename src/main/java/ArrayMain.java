/*
PROBLEMS IN ARRAY TO SOLVE
1.HOMOGENOUS DATA
2.SIZE

ALGORITHM TO DEMONSTRATE HOW TO INCREASE CAPACITY OF ARRAY ALL THE METHOD IMPLEMENTATION OF ARRAY
ALGORITHM TO DEMONSTRATE HOW ARRAY LIST INCREASE ITS CAPACITY
*/


import java.util.Scanner;

class CustomArray {
    private Object[] objArray=new Object[10];       //Create Object[] with some initial capacity
    private int elementCount=0;


    public void add(Object obj){
        if(elementCount== objArray.length){         //Before storing objects,check whether size==capacity
            increaseCapacity();
        }
        objArray[elementCount]=obj;                 //Store objects in this array object
        elementCount++;
    }




    public void increaseCapacity(){
        int newCapacity=objArray.length*2;
        Object[] nextArray=new Object[newCapacity];      //Create new array object with more capacity

        for(int i=0;i<objArray.length;i++){       //Copy old array elements into this new array
           nextArray[i]=objArray[i];
        }

        objArray=nextArray;                        //Assign new array reference to old array variable


    }

    public void display(){
        for(int i=0;i<objArray.length;i++){
            System.out.print(objArray[i]+" ");
        }
        System.out.println();
    }

    public int size(){
        return elementCount;
    }

    public int capacity(){
        return objArray.length;
    }

    public Object get(int index){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException(""+index);
        }
        return objArray[index];
    }

    public void replace(int index,Object obj){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException(""+index);
        }
        objArray[index]=obj;
    }


    public void remove(int index){
        if(index<0 || index>size()){
            throw new IndexOutOfBoundsException(""+index);
        }
        while(index<size()-1){
            objArray[index]=objArray[index+1];
            index++;
        }
        objArray[index]=null;
        elementCount--;
    }


    public void insert(int index,Object obj){
        if(index<0 || index>size()){
            throw new IndexOutOfBoundsException(""+index);
        }
        if(size()==capacity()){
            increaseCapacity();
        }
        for(int i=size()-1;i>=index;i--){
            objArray[i+1]=objArray[i];
        }
        objArray[index]=obj;
        elementCount++;
    }
}

    public class ArrayMain {
        public static void main(String[] args) {
            CustomArray arr = new CustomArray();
            arr.add("1");
            arr.add(2);
            arr.add("a");
            arr.add(null);
            arr.add("str");
            arr.add(6);
            arr.add("4");
            arr.add("b");
            arr.add("c");

            arr.display();
            System.out.println("The capacity is "+arr.capacity());

            System.out.println("The size is "+arr.size());

            System.out.println("The element at index is:"+arr.get(8));

            arr.replace(2,"Solaris");
            System.out.println("After replacement");
            arr.display();

            arr.remove(3);
            System.out.println("After removal");
            arr.display();

            arr.insert(2,"H");
            System.out.println("After insertion");
            arr.display();

        }
    }
