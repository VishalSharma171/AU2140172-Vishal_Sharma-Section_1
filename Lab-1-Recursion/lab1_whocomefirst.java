/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class lab1_whocomefirst {
     public static void first(){
        second();
        System.out.println("I am the first");
    }
    public static void second(){
        third();
        System.out.println("i am the second");
    }
    public static void third(){
        fourth();
        System.out.println("I am the third");
    }
    public static void fourth(){
        System.out.println("I am fourth");
    }
    public static void main(String[] args) {
        first();
    }
    
}
