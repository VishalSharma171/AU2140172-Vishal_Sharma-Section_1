/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class Queue {
   Node front;
    Node back;
    int size=0;

    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        else {
            return false;
        }
    }

    public int length(){
        return size;
    }

    public void enqueue(int item){

        Node node = new Node(item);

        if(isEmpty()){
            front = node;
            back = node;
        }
        Node temp = back;
        temp.next = node;
        back = node;
        back.next = null;
        size++;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Cannot dequeue beacause queue is empty");
            return -1;
        }
        Node temp1 = front;
        front = front.next;
        size--;
        return temp1.value;
    }

    public void printQueue(){
        if(isEmpty()){
            System.out.println("Cannot print beacuse queue is empty");
            return;
        }
        Node temp = front;
        while (temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

    }
}


