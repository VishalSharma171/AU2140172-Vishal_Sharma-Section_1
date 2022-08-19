/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class lab1_factorial {
    
    public static int fact(int n) {
        if(n==0||n<=0){
            return 1;
        }
        return n*fact((n-1));
        
    }
    public static void main(String[] args) {
        int n= 5;
        System.out.println(fact(n));
    }
}
