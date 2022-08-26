/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Vishal Sharma
 */
public class delatind {
    public static int[] delatind(int[] arr, int x){
         for(int i=x; i<arr.length; i++){
            
             arr[i-1] = arr[i];
         }
         
         return arr;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        
        int x=2;
        int[] arr1 = delatind(arr,x);
        for(int i=0; i<arr1.length-1; i++){
            System.out.println(arr1[i]);
        }
    }
}
