/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class Dequeue {
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

        public void enqueue_back(int item){

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

        public void enqueue_front(int item){

            Node node = new Node(item);

            if(isEmpty()){
                front = node;
                back = node;
                size++;
                return;
            }
            node.next = front;
            front = node;
            size++;
        }

        public int dequeue_front(){
            if(isEmpty()){
                System.out.println("Cannot dequeue beacause stack is empty");
                return -1;
            }
            Node temp1 = front;
            front = front.next;
            size--;
            return temp1.value;
        }

        public int dequeue_back(){
            if(isEmpty()){
                System.out.println("Cannot dequeue because stack is empty");
                return -1;
            }
            Node last_Second = front;
            while (last_Second.next.next != null){
                last_Second = last_Second.next;
            }
            Node temp = back;
            back = last_Second;
            last_Second.next = null;
            size--;
            return temp.value;
        }

        public void printDeque(){
            if(isEmpty()){
                System.out.println("Cannot print because queue is empty.");
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
