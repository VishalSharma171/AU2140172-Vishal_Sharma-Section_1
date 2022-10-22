/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_hasing;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Vishal Sharma
 */
public class Q7 {
  
    static ArrayList<Integer>[] Hashing(int[] arr, int M){

        ArrayList<Integer>[] newArr = new ArrayList[M];

        for (int j = 0; j < newArr.length; j++) {
            
            newArr[j] = new ArrayList<>();
            
        }

        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];

            int posi = key%M;

            newArr[posi].add(key);

        }
        
        return newArr;
        
    }
    public static void main(String[] args) {

        int[] arr = {12,22,13,23,15,20,33};

        int M = 10;

        ArrayList<Integer>[] result = Hashing(arr,M);

        for (int k = 0; k < result.length; k++) {

            System.out.println(k+" : "+result[k]);
        }
    }
}


