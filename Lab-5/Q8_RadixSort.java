import java.util.*;
import java.io.*;
public class Q8_RadixSort {
    public static void main(String[] args) {
        int[] ar = {2,89,4,59,45,1,567};
        radixSort(ar, ar.length);
        System.out.println(Arrays.toString(ar));
    }
    static void radixSort(int[] ar, int a){
        int max = max(ar);
        for(int place = 1; max / place > 0; place *= 10){
            count(ar, ar.length, place);
        }
    }
    static int max(int[] ar){
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if(max < ar[i]){
                max = ar[i];
            }
        }
        return max;
    }
    static void count(int[] ar, int a, int place){
        int output[] = new int[a];
        int count[] = new int [10];
        Arrays.fill(count, 0);
        for(int i = 0; i < a; i++){
            count[(ar[i]/place) % 10] ++;
        }
        for(int i = 1; i < 10; i++){
            count[i] += count[i - 1];
        }
        for(int i = a-1; i >= 0; i--){
            output[count[(ar[i]/place) % 10] - 1] = ar[i];
            count[(ar[i] / place) % 10]--;
        }
        for(int i = 0; i < a; i ++){
            ar[i] = output[i];
        }
    }
}
