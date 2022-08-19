
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class lab1_addup {
    public static int addup(int n) throws IllegalArgumentException{
        
        if(n==1 ){
            
            return 1;
        }
        int add = n+addup(n-1);
        
        return add;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(addup(n));
    }
}
