/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class linkedlist {
     private Node head=null;
    private Node tail=null;
    private int size=0;

    // 6. Write a function lsrch(linked_list,element) that searches a linked list for the
    //    element and returns the index (position) in the linked lsit if the element is found, and
    //    -1 otherwise.

    public int lsrch(int value){

        int ind =1;
        linkedlist.Node node = head;
        while(node != null){
            if(node.value == value){
                return ind;
            }
            node = node.next;
            ind++;
        }
        return -1;
    }
    //  7. Write a function linsatend(linked_list,element) that inserts an element at the end
    //     of a linked list.
    public void linsatend(int val){
        Node node = new Node(val);
        Node temp = head;
        if(head==null){
            head=node;
        }
        else {
            while (temp.next != null){
                temp = temp.next;
                size++;
            }
            temp.next = node;
            node.next = null;
            tail = node;
        }
    }
    //  8.a Write a function linsatbeg(linked_list,element) that inserts an element at the
    //    beginning of the linked list.
    public void linsatbeg(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail  == null){
            tail = head;
        }

        size++;
    }
    //  8.b Write a function delatend(linked_list) that deletes the last element of the linked
    //    list.

    public int deleteFirst(){

        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }


//    10. Write a function replatind(linked_list,position,element) to replace an element in
//    the linked_list at the specified position.

    public void replatind(int x, int value){

        Node temp = head;
        linkedlist.Node node = new Node(value);
        if(x==1){
            node.next = temp.next;
            head = node;
            return;
        }
        for (int i = 1; i < x-1; i++) {
            temp = temp.next;
        }
        node.next = temp.next.next;
        temp.next = node;
    }

    public Node get(int index){

        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

   
    public int delatend(){

        if(size<=1){
            return deleteFirst();
        }

        Node secondLast = get(size-1);
        int val = tail.value;
        tail = secondLast;
        
        size--;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }
}
