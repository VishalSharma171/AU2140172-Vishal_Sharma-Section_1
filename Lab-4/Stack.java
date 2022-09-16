/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class Stack {
    

        
            public Node top;
    int size=0;

    public int length(){
        return size;
    }
    public boolean isEmpty(){
        if(size ==0){
            return true;
        }
        return false;
    }

    public int peek(){
        return top.value;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Cannot pop because stack is empty");
            return -1;
        }
        Node temp1 = top;
        Node temp = top;
        top = temp.next;
        size--;
        return temp1.value;
    }

    public void push(int val){
        Node node = new Node(val);
        if(isEmpty()){
            top = node;
           top.next = null;
        }
        else {
            node.next = top;
            top = node;
        }
        size++;
    }

    public void printStack(){

        Node temp = top;
        while (temp != null){
            System.out.println("["+temp.value+"]");
            temp = temp.next;
        }
    }

    public static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
        }

