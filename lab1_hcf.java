/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class lab1_hcf {
     public static int hcf(int a, int b){
        int rem = b%a;
        if(rem == 0){
            return a;
        } 
        return hcf(rem,a);
    }
    
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        
        System.out.println(hcf(a,b));
    }
}
