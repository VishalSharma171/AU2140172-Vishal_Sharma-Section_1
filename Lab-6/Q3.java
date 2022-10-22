/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_hasing;
import java.util.Arrays;
/**
 *
 * @author Vishal Sharma
 */
public class Q3 {
   
        static int HP(int element, int a){
        return 1+element%a;
    }

    static int returnIndex(int[] HashTable, int element,int a){

        int n = HashTable.length;
        
        int index = element%n;

        if(HashTable[index] != element){
            
            for (int j = 0; j < n; j++) {
                
                int t = (index + j*HP(element,a))%n;
                if(HashTable[t] == element){
                    return t;
                    
                }
            }
        }
        
        else {
            
            return index;
            
        }

        return -1;
    }

    static boolean contains(int[] Hashtable, int num,int a){
        
        return returnIndex(Hashtable, num,a) != -1;
        
    }

    static int[] Hashing(int[] arr,int b, int p){

        int[] newArr = new int[b];
        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];

            int posi = key%b;

            if(newArr[posi] == 0){
                
                newArr[posi] = key;
                
            }
            else {
                
                for (int j = 0; j < b; j++) {
                    
                    int x = (posi + j*HP(key,p))%b;
                    if(newArr[x] == 0){
                        newArr[x] = key;
                        break;
                        
                    }
                }
            }

        }
        return newArr;
    }

    public static void main(String[] args) {

        int[] arr = {133, 88, 92, 221, 174};

        int a = 11;

        int b = 17;

        int[] hashTable1 = Hashing(arr,b,a);

        System.out.println(Arrays.toString(hashTable1));
        System.out.println();
        
        System.out.println(contains(hashTable1,100,a));
        System.out.println(contains(hashTable1,133,a));
        System.out.println(contains(hashTable1,174,a));

    }
}


