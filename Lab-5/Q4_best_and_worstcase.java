import java.util.Arrays;
public class Q4_best_and_worstcase{
    public static void main(String[] args) {
        //Best case for selection sort
        System.out.println("Selection Sort Best case");
        long st = System.nanoTime();
        int[] arr1 = {1, 2, 3, 4, 5};
        SelectionSort x1 = new SelectionSort(arr1);
        System.out.println(Arrays.toString(x1.returnArr(arr1)));
        long end = System.nanoTime();
        System.out.println("Elapsed Time in milli seconds: "+ (end-st));


        //Worst case for selection sort
        System.out.println("Selection Sort Worst case");
        long st1 = System.nanoTime();
        int [] arr2 = {9, 8, 7, 6, 5};
        SelectionSort x2 = new SelectionSort(arr2);
        System.out.println(Arrays.toString(x2.returnArr(arr2)));
        long end1 = System.nanoTime();
        System.out.println("Elapsed Time in milli seconds: "+ (end1-st1));


        //Best Case for insertion sort
        System.out.println("InsertionSort Best Case");
        long st2 = System.nanoTime();
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        InsertionSort x3 = new InsertionSort(arr3);
        System.out.println(Arrays.toString(x3.returnArr(arr1)));
        long end2 = System.nanoTime();
        System.out.println("Elapsed Time in milli seconds: "+ (end2-st2));

        //InsertionSort Sort Worst case
        System.out.println("InsertionSort Sort Worst case");
        long st3 = System.nanoTime();
        int [] arr4 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        InsertionSort x4 = new InsertionSort(arr4);
        System.out.println(Arrays.toString(x4.returnArr(arr2)));
        long end3 = System.nanoTime();
        System.out.println("Elapsed Time in milli seconds: "+ (end3-st3));
    }
}
class SelectionSort{
    public SelectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int min = min(i, arr);
            swap(min, i, arr);
        }
    }
    int min(int i, int[] arr){
        for (int j = i; j < arr.length; j++) {
            if(arr[i] > arr[j]){
                i = j;
            }
        }
        return i;
    }
    void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    int[] returnArr(int[] arr){
        return arr;
    }
}

class InsertionSort{

    public InsertionSort(int[] arr){

    }
    int binarySearch(int target, int s, int e,int[] arr){
        while(s < e){
            int mid = s + (e - s)/2;
            if(target < arr[mid]){
                e = mid - 1;
            }
            else if(target > arr[mid]){
                s = mid + 1;
            }
            else{
                return mid;
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
    void swap(int j, int i, int[] arr){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    int[] returnArr(int[] arr){
        return arr;
    }
}