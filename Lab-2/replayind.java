/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class replayind {
    public static int[] replayind(int arr[], int x,int element){
        for(int i=arr.length-1; i>0; i--){
            if(i==x){
                arr[i]=element;
            }
            
        }
        
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,8,9};
        int x =2;
        int[] arr1 = replayind(arr,x,50);
        if(x>arr.length || x<=0){
            System.out.println("-1");
            System.exit(0);
        }
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
    
}
}