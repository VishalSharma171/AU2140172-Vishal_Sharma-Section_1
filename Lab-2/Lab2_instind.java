/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Vishal Sharma
 */
public class Lab2_instind {
    public static int[] insatind(int arr[], int x,int element){
        
        for(int i=arr.length-1; i>x-1; i--){
            
            arr[i] = arr[i-1];
        }
        
        arr[x-1] = element;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        
        int[] arr1 = new int[5];
        
        for(int j=0; j<arr.length; j++){
            arr1[j]=arr[j];
        }
        insatind(arr1,2,7);
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
        
        
        
    }
}
