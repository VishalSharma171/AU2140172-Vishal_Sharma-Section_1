/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
public class ImplementationofPriorityQueue {
    public static void main(String[] args) {

        PriorityQueue p1 = new PriorityQueue();

        p1.enqueue("a", 1);
        p1.enqueue("b", 2);
        p1.enqueue("c", 2);
        p1.enqueue("d", 3);

        p1.print_PQ();

        System.out.println(p1.dqueue());

        p1.print_PQ();
    }
}
