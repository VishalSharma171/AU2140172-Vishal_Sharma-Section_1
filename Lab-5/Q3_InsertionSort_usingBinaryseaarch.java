
import java.util.Arrays;
import java.util.*;
public class Q3_InsertionSort_usingBinaryseaarch{

    public static void main(String[] args) {
       
        long startTime = System.nanoTime();

        int[] arr = {10,5,15,6,2};

        int[] sorted_arr = Insertion_sort(arr);

        System.out.println(Arrays.toString(sorted_arr));

        long endTime = System.nanoTime();
        long TotalTime = endTime - startTime;

        System.out.println(TotalTime);
    }
    static int binarySearch(int[] arr, int target, int s, int e){
        while(s < e){
            int middle = s + (e - s)/2;
            if(target < arr[middle]){
                e = middle - 1;
            }
            else if(target > arr[middle]){
                s = middle + 1;
            }
            else{
                return middle;
            }
        }
        if(arr[s] < target){
            return e+1;
        }
        if(e < 0){
            return s;
        }
        return e;
       
           
        }


        static int[] Insertion_sort(int[] arr){

            for (int i = 1; i < arr.length; i++) {
                int temp = arr[i];
                int j = i;
                int k =0;
                if (arr[i]<arr[j-1]){
                    k = binarySearch(arr,temp,0,i-1);
                }
                else {
                    k = j;
                }
                while (j>k) {
                    arr[j] = arr[j-1];
                    j--;
                    if(j == 0){
                        break;
                    }
                }
                arr[j] = temp;
            }
            return arr;
        }

      
    
    static void swap(int j, int i, int[] arr){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
