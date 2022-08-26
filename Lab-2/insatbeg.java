/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Vishal Sharma
 */
public class insatbeg {
    public static int[] insatbeg(int arr[],int element){
        for(int i=arr.length-1; i>0; i--){
            
            arr[i] = arr[i-1];
        }
        
        arr[0]=element;
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,8,9};
        
        int[] arr1 = new int[5];
        
        for(int j=0; j<arr.length; j++){
            arr1[j]=arr[j];
        }
        insatbeg(arr1,70);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        
        
        
    }
}
