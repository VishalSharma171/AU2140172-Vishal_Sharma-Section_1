import java.util.Arrays;
public class Q6_QuickSort {
    public static void main(String[] args) {
        int[] arr = {12,3,45,32,109};
        QuickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    static int partition(int[] arr, int x, int k){  
        int a = x + (k - x)/2;
        int pivot = arr[a];
        int j = arr.length  -1;
        for(int i = 0; i < a; i ++){
            if(arr[i] > pivot){
                while(arr[j] > pivot){
                    j--;
                }
                swap(j, i, arr);
            }
        }
        if(arr[a] > arr[j]){
            swap(a, j, arr);
        }
        return a;
    }
    static void QuickSort(int[] arr, int x, int k){
        if(x < k){
            int pi = partition(arr, x, k);

            QuickSort(arr, x, pi);
            QuickSort(arr, pi + 1, k);
        }
    }
    static void swap(int j, int i, int[] arr){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
