/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_hasing;
import java.util.Arrays;
import static lab6_hasing.Q1.Hashing;
/**
 *
 * @author Vishal Sharma
 */
public class Q2 {
    
        static int Returnindex(int[] HashTable, int element){
 
        int n = HashTable.length;
        
        int Index = element%n;

        if(HashTable[Index] != element){
            
            for (int i = 0; i < n; i++) {
                
                int t = (Index + i*i)%n;
                if(HashTable[t] == element){
                    
                    return t;
                }
                
            }
            
        }
        
        else {
            
            return Index;
            
 }
        return -1;
    }

    static boolean contains(int[] hashtable, int num){
        
        return Returnindex(hashtable, num) != -1;
        
    }

    static int[] Hashing(int[] arr,int N){

        int[] newArr = new int[N];
        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int pos = key%N;

            if(newArr[pos] == 0){
                
                newArr[pos] = key;
                
            }
            else {
                
                for (int k = 0; k < N; k++) {
                    int t = (pos + k*k)%N;
                    if(newArr[t] == 0){
                        newArr[t] = key;
                        break;
                    }
                }
            }

        }
        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {133, 88, 92, 221, 174};
        int[] listnumber = {3,2,9,6,11,13,7,12};
        
        int M1 = 17;

        int M2 = 37;

        int[] hashTable1 = Hashing(arr,M1);
        
        int[] hashTable2 = Hashing(arr,M2);


        System.out.println(Arrays.toString(hashTable1));
        System.out.println(Arrays.toString(hashTable2));
        System.out.println();
        
        System.out.println(contains(hashTable1,100));
        System.out.println(contains(hashTable1,133));
        System.out.println(contains(hashTable1,174));
        System.out.println();
        
        System.out.println(contains(hashTable2,100));
        System.out.println(contains(hashTable2,133));
        System.out.println(contains(hashTable2,174));
        
        int[] result3 = Hashing(listnumber, M1);
        System.out.println(Arrays.toString(result3));


        

    }
}


