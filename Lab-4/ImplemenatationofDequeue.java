/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class ImplemenatationofDequeue {
    public static void main(String[] args) {
        Dequeue d1 = new Dequeue();

        d1.enqueue_front(10);
        d1.enqueue_front(20);
        d1.enqueue_front(30);
        d1.enqueue_front(40);
        d1.enqueue_front(50);

        d1.printDeque();
        System.out.println(d1.dequeue_back());;
        d1.printDeque();
    }
}
