/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class PriorityQueue {
    Node head;
    Node tail;

    int size;

    public int length(){
        return size;
    }

    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        return false;
    }

    public void enqueue(String item, int priority){

        Node node = new Node(item,priority);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
            return;
        }
        Node temp = head;
        if(node.priority>tail.priority){
            tail.next = node;
            tail = node;
        }
        else {
                if(node.priority<head.priority){
                    node.next = head;
                    head = node;
                }
                else {
                    while (node.priority < temp.priority){
                        temp = temp.next;
                    }
                    node.next = temp.next;
                    temp.next = node;
                }
        }
        size++;
    }

    public String dqueue(){
        Node temp = head;
        head = head.next;
        return temp.value;
    }
    public void print_PQ(){
        Node temp = head;
        while (temp != null){
            System.out.print("["+temp.priority+","+temp.value+"]"+" --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public class Node{
        String value;

        int priority;
        Node next;

        public Node(String value) {
            this.value = value;
        }

        public Node(String value,int priority) {
            this.value = value;
            this.priority = priority;
        }

    }
}
