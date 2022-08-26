/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Vishal Sharma
 */
public class insatend {
    public static int[] insatend(int[] arr, int element){
        
          arr[arr.length-1]=element;  
        
 
        return arr;
    }
    public static void main(String[] args) {
         int[] arr = {2,4,6,8};
        
        int[] arr1 = new int[5];
        insatend(arr1,100);
        for(int j=0; j<arr.length; j++){
            arr1[j]=arr[j];
        }
       for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
    }
            
}
