import java.util.Arrays;
public class Q5_MergeSort {
    static void Merge(int[] arr, int s, int a,int e){

        if(s+1 == e){
            return;
        }

        int[] tmpArr = new int[e-s];

        int i = s;
        int j = a;
        int b = 0;

        while (i<a && j<e){
            if(arr[i]>arr[j]){
                tmpArr[b] = arr[j];
                j++;
            }
            else {
                tmpArr[b] = arr[i];
                i++;
            }
            b++;
        }

        while (i<a){
            tmpArr[b] = arr[i];
            b++;
            i++;
        }

        while (j<e){
            tmpArr[b] = arr[j];
            b++;
            j++;
        }

        for (int l = 0; l < tmpArr.length; l++) {
            arr[s+l] = tmpArr[l];
        }
    }

    static void MergeSort(int[] arr, int s, int e){

        int m = (s+e)/2;
        if(s == m){
            return;
        }

        MergeSort(arr, s, m);
        MergeSort(arr, m, e);

        Merge(arr,s,m,e);
    }


    public static void main(String[] args) {

        int[] arr = {15,40,23,02,18};

        MergeSort(arr,0, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
