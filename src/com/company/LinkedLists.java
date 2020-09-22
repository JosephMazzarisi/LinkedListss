package com.company;

public class LinkedLists {
    Node head;
    int len;
    public class Node{
        Object data;
        Node next;
        Node prev;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = null;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

public void setHead(Node head) {this.head = head;}
public Node getHead() {return head;}

    public void addFirst(Object data){ //adds the given object to the start of the list
        Node temp = head;
        head.setData(data);
        head.setNext(temp);
    }

    public void addLast(Object data){ //adds the object to the end of the list
        Node x = head;
        Node newNode = new Node(data, null);
        while(x.getNext() != null){
            x = x.getNext();
        }
        x.setNext(newNode);
    }

    public void add(int index, Object data) { //adds the given object to the given index
        if(head == null)
            return;
        Node x = head;
        Node newNode = new Node(data, null);
        for(int i = 0; i <= index; i++) {
            x = x.getNext();
        }
        x.setNext(newNode);
    }
    int size() { //returns the size of the list
       int count = 0;
       Node x = head;
       while(x.getNext() != null)
           count++;
       return count;
    }
    public void clear () { //works
        head = null;
    } //clears the list
     boolean contains (Object item) { //traverses the list to check for the given item
        Node x = head;
        while(x.getData() != item) {
            x = x.getNext();
        }
        if(x.getData() == item)
            return true;
        return false;


     }
     Object set(int index, Object item) { //sets the object at the given index to the given object
        Node x = head;
        for(int i = 0; i<index; i++) {
            x = x.getNext();
        }
        x.setData(item);
        return null;
     }

     Object remove(int index){ //removes an object at a specefic index
        Node x = head;
         if(index > size() + 1 || index < 0) {
             return null;
         }
        for(int i = 0; i<index; i++) {
           x = x.getNext();
           x.setData(null);
        }
        return x;
    }
    public Object removeObject(Object obj) { //removes a specific object from the list
        Node x = head;
        while(x!=obj) {
            x = x.getNext();
            x.setData(null);
        }
        if(x==obj)
        return x;
        else
            return null;
    }

     Object get(int index) { //gets the object at the given index
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x;
    }
     Object getFirst() { //returns the first object in the list
        Node x = head;
        return x;
    }
    Object getLast() { //returns the last object in the list
        Node x = head;
        while(x.getNext() != null)
            x = x.getNext();
        return x;
    }
    int indexOf (Object item) { //returns the indexOf the given item
        Node x = head;
        int count = 0;
        if (x.getData() == item)
            return count;
        while(x.getNext() != item) {
            x = x.getNext();
            count++;
        }
        return count;
    }
    Object poll() { //removes and returns the first object
         Node x = head;
         head = x.getNext();
         return x;
    }
    Object pollLast() { //removes and returns the last object
        Node x = head;
        Node temp = x;
        while(x.getNext() != null) {
            x = x.getNext();
            x.setData(null);
        }
        return x;

    }
    int lastIndexOf(Object obj) { //returns the last occurence of the given object
        Node x = head;
        int count = 0;
        if(x.getData() == obj)
            count = 1;
        for(int i = 0; i<size(); i++)
            if(x.getNext() == obj) {
                count = i + 1;
            }
        return count - 1;
    }
}
