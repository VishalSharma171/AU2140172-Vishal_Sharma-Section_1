/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//import java.util.*;
//import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author Vishal Sharma
 */
class Heap{
    int[] arr;
    ArrayList<Integer> HeapArray;
    
    public Heap(int[] arr){
        
        this.arr = arr;
    }
    public void MinHeapSort(){
        
        HeapArray = ConvertToArrList(arr);
        
        for(int i = HeapArray.size()/2 - 1; i >=0; i --){
            
            Heapify(HeapArray, HeapArray.size(), i);
        }
        
        Print(HeapArray);
    }
    private ArrayList<Integer> ConvertToArrList(int[] arr){
        ArrayList<Integer> HeapArr = new ArrayList<>();
        
        for (int a: arr) {
            
            HeapArr.add(a);
            
        }
        
        return HeapArr;
    }
    private void Heapify(ArrayList<Integer> arr, int N, int OldSmallest){
        
        int newSmallest = OldSmallest;
        int left = 2*OldSmallest + 1;
        int right = 2*OldSmallest + 2;

        if(left < N && arr.get(left) < arr.get(newSmallest)){
            
            newSmallest = left;
            
        }
        
        if(right < N && arr.get(right) < arr.get(newSmallest)){
            
            newSmallest = right;
        }
        if(newSmallest != OldSmallest){
            
            Swap(arr, OldSmallest, newSmallest);
            Heapify(arr, N, newSmallest);
            
        }
    }
    public void Insert(int data){
        HeapArray.add(data);
        int Newdata = HeapArray.size() - 1;
        
        int rightplace = (Newdata + 1)/2 - 1;
        while(HeapArray.get(Newdata) < HeapArray.get(rightplace)){
            
            Heapify(HeapArray, HeapArray.size(), rightplace);
            Newdata = rightplace;
            rightplace = (Newdata + 1)/2 - 1;
            if(rightplace < 0 || Newdata < 0){
                
                break;
            }
        }
    }
    
    
    public void Extract(){
        
        HeapArray.set(0, HeapArray.get(HeapArray.size()-1));
        HeapArray.remove(HeapArray.size() - 1);
        Heapify(HeapArray, HeapArray.size(), 0);
        
    }
    
    public int GetMin(){
        
        return HeapArray.get(0);
        
    }
    
    
    private void Swap(ArrayList<Integer> arr, int oldSmallest, int newSmallest){
        
        int temp = arr.get(oldSmallest);
        arr.set(oldSmallest, arr.get(newSmallest));
        arr.set(newSmallest, temp);
        
    }
    
    public void Print(ArrayList<Integer> heapArr){
        System.out.print("[");
        int i = 0;
        
        while(i != heapArr.size() - 1){
            
            System.out.print(heapArr.get(i) + ", ");
            i++;
            
        }
        System.out.print(heapArr.get(i) + "]\n");
    }
}
public class Q3_Minheapsort {
    public static void main(String[] args) {
        
    
   
    int[] heapArray = {16,14,12,8,11,29,43,7,9,26,5};
        Heap H = new Heap(heapArray);
        H.MinHeapSort();
        H.Insert(18);
        H.Insert(23);
        H.Insert(27);
        H.Insert(10);
        H.Print(H.HeapArray);
        H.Extract();
        H.Print(H.HeapArray);
        System.out.println("minimum  value of the element is " + H.GetMin());
        H.Extract();
        H.Print(H.HeapArray);
        H.Extract();
        H.Print(H.HeapArray);
}
}