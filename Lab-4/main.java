/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;

/**
 *
 * @author Vishal Sharma
 */
class main{

    public static void main(String[] args) {

        Stack s1 = new Stack();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.printStack();
        System.out.println(s1.peek());
        System.out.println(s1.length());


        System.out.println();
        s1.pop();
        s1.printStack();

        System.out.println();
        System.out.println(s1.length());
    }
}
        }
}
