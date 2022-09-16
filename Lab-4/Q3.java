/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
public class Q3 {
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

    public char peek(){
        return top.value;
    }

    public char pop(){
        if(isEmpty()){
            System.out.println("Cannot pop beacuse stack is empty ");
            return '0';
        }
        Node temp1 = top;
        Node temp = top;
        top = temp.next;
        size--;
        return temp1.value;
    }

    public void push(char val){
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


    public class Node{
        private char value;
        private Node next;

        public Node(char value){
            this.value = value;
        }
        public Node(char value, Node next){
            this.value = value;
            this.next = next;
        }
    }

}
public class Q3{

    public static boolean Check_Code(String str){

        Stack_for_char s1 = new Stack_for_char();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '/' && str.charAt(i+1) == '/'){
                break;
            }

            if(i == str.length()-1){

                    if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){
                        if(s1.isEmpty() || s1.length()>1){
                            return false;
                        }
                        else {
                            return true;
                        }
                    }
                    else if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '[') {
                        return false;
                    }
            }

            if(str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(' ){

                    s1.push(str.charAt(i));

            }
            else if(str.charAt(i) == '}' || str.charAt(i) == ']' || str.charAt(i) == ')'){

                    s1.pop();

            }


        }
        return s1.isEmpty();
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(Check_Code(str));

    }
}
