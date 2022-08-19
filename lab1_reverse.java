/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
public class lab1_reverse {
     public static String reverseString(String str){ 

            if(str.isEmpty()){  
            System.out.println("String is empty.");  
            return str;  
            }   
            else{  
            return reverseString(str.substring(1))+str.charAt(0);  
            }  
    }  
        public static void main(String[] args){  

            Scanner sc = new Scanner(System.in);
            String str = sc.next();  
            System.out.println(reverseString(str));
        }  
    
}
