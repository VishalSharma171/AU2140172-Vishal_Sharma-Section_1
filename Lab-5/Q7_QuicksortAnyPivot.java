import java.lang.Math;
import java.util.Arrays;

public class Q7_QuicksortAnyPivot{
    public static void main(String[] args) {
        int[] ar = {2,4,1,7,3,1};
        QuickSort(0, ar.length - 1, ar);
        System.out.println(Arrays.toString(ar));
    }
    static void QuickSort(int s, int e, int[] ar){
        if(s < e){
            int pi = partition(s, e, ar);

            QuickSort(s, pi, ar);
            QuickSort(pi + 1, e, ar);
        }
    }
    static int partition(int s, int e, int[] ar){
        double r = Math.random();
        int pivotInx = (int)(r * (e - s)) + s;
        int pivot = ar[pivotInx];
        int j = e;
        for(int i = 0; i < pivotInx; i ++){
            if(ar[i] > pivot){
                while(ar[j] > ar[i]){
                    j--;
                }
                swap(j, i, ar);
            }
        }
        if(ar[pivotInx] > ar[j]){
            swap(pivotInx, j, ar);
        }
        return pivotInx;
    }
    static void swap(int j, int i, int[] ar){
        int temp = ar[j];
        ar[j] = ar[i];
        ar[i] = temp;
    }
}