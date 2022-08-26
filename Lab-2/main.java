/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class main {
     public static void main(String[] args) {

        linkedlist list = new linkedlist();

        list.linsatend(1);
        list.linsatend(2);
        list.linsatend(3);
        list.linsatend(4);

        list.display();

        // 6. Write a function lsrch(linked_list,element) that searches a linked list for the
          //  element and returns the index (position) in the linked lsit if the element is found, and
            //-1 otherwise.

        System.out.println(list.lsrch(4));

        //  7. Write a function linsatend(linked_list,element) that inserts an element at the end
        //     of a linked list.

        list.linsatend(7);
        list.display();
//  8.a Write a function linsatbeg(linked_list,element) that inserts an element at the
        //    beginning of the linked list.

        list.linsatbeg(8);
        list.display();

        //  8.b Write a function delatend(linked_list) that deletes the last element of the linked
        //    list.

       list.delatend();
        list.display();

        //  10. Write a function replatind(linked_list,position,element) to replace an element in
        //      the linked_list at the specified position.

       list.replatind(4,6);
        list.display();


       


    }
}
        

