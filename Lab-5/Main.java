//Q1 & Q2
import java.util.Arrays;
public class Main {
    static void selection(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last  = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void swap(int[] arr , int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        
    }
     static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i =0; i<=end; i++){
            if(arr[max]<arr[i]){
               max = i; 
            }
        }
        return max;
    }
    static void Bubble(int[] arr)
    {
        boolean swapped;
        for(int i=0; i<arr.length; i++)
        {
            swapped = false;
            for(int j=1; j<arr.length-i; j++)
            {
                if(arr[j]<arr[j-1])
                {
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }  
            if(swapped == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,8,3};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Your array is sorted using Bubble sort!");
        selection(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("Your array is sorted using Selection sort! ");
        
        
    }
}
