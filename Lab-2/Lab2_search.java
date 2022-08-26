/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab.pkg2;

/**
 *
 * @author Vishal Sharma
 */
public class Lab2_search {
    public static int srch(int arr[],int i){
        if(i>=arr.length){
            return -1;
        }
        return arr[i];
    }
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        System.out.println(srch(arr,1));
    }
    
    
}
