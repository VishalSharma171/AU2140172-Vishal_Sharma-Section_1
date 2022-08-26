/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class AppendDoublyLL {
    public static void main(String[] args) {
        Node_Returns n1 = new Node_Returns(1);
        Node_Returns n2 = new Node_Returns(12);
        Node_Returns n3 = new Node_Returns(5);
        Node_Returns n4 = new Node_Returns(8);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.prev = n3;
        n3.prev = n2;
        n2.prev = n1;
        DoublyLL dll = new DoublyLL(n1);
        dll.dubbly_append(dll, 16);
        dll.display();
    }
}
