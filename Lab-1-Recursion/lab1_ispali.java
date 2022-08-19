/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
public class lab1_ispali {
   
        

private static Scanner sc; 
static boolean checkPalindrome(String str, int a, int b) 
    { 
        if (a == b)    
            return true;  
      
        if ((str.charAt(a)) != (str.charAt(b))) 
            return false;   
        
        if (a < b + 1) 
            return checkPalindrome(str, a + 1, b - 1);   
        return true; 
    }   
    static boolean isPalindrome(String str) 
    { 
        int n = str.length();   
        if (n == 0) 
            return true;   
        return checkPalindrome(str, 0, n - 1); 
    }   

    public static void main(String args[]){
        
        sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   
         if (isPalindrome(str)) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    }   
}
    

