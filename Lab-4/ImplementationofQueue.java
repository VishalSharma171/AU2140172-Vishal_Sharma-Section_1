/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class ImplementationofQueue {
     public static void main(String[] args) {

        Queue q1 = new Queue();

        q1.enqueue(14);
        q1.enqueue(10);
        q1.printQueue();
        q1.dequeue();
        q1.printQueue();
        q1.dequeue();

    }
}
