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
public class Q4 {
   
    static void Contains(int[] HashTable1, int[] HashTable2, int element){

        int n1 = HashTable1.length;
        int n2 = HashTable2.length;
        
        int index1 = element%n1;
        int index2 = element%n2;

        if(HashTable1[index1] == 1 && HashTable2[index2] == 1){
            
            System.out.println(element+" is in Hashtable1 and Hashtable2");
            
        }
        else{
            
            System.out.println(element+" is not in Hashtable1 and Hashtable2");
            
        }

    }

    static int[] Hashing(int[] arr,int a){

        int[] newArr = new int[a];
        for (int i = 0; i < arr.length; i++) {

            int key = arr[i];
            int posi = key%a;

            if(newArr[posi] == 0){
                
                newArr[posi] = 1;
                
            }
            else {
                
                while (newArr[posi]!=0){
                    
                    if(posi == newArr.length-1){
                        
                        posi = 0;
                        continue;
                        
                    }
                    
                    posi++;
                    
                }
                newArr[posi] = 1;
            }

        }
        return newArr;
        
    }

    public static void main(String[] args) {

        int[] arr = {133, 88, 92, 221, 174};

        int M1 = 17;

        int M2 = 37;

        int[] Hashtable1 = Hashing(arr,M1);
        int[] Hashtable2 = Hashing(arr,M2);

        System.out.println(Arrays.toString(Hashtable1));
        System.out.println(Arrays.toString(Hashtable2));
        System.out.println();
        
        Contains(Hashtable1,Hashtable2,100);
        Contains(Hashtable1,Hashtable2,133);
        Contains(Hashtable1,Hashtable2,174);
  
    }
}


