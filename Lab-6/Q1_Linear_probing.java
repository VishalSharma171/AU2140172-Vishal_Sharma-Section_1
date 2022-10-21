import java.lang.reflect.Array;
import java.util.Arrays;
public class Q1_Linear_Probing {
    public static void main(String[] args) {
        int[] arr = {133, 88, 92, 221, 174};
        int[] listnumber = {3,2,9,6,11,13,7,12};
        
        int m1 = 17; 

        int m2 = 37;

        int[] result1 = hashing(arr, m1);
        
        System.out.println(Arrays.toString(result1));

        int[] result2 = hashing(arr, m2);
        System.out.println(Arrays.toString(result2));
        
        System.out.println(checkinHashtable(result1, m1, 100));
        System.out.println(checkinHashtable(result1, m1, 133));
        System.out.println(checkinHashtable(result1, m1, 174));

        System.out.println(Arrays.toString(hashing(arr,m2)));
        System.out.println(Arrays.toString(hashing(arr,m2)));

        int[] result3 = hashing(listnumber, m1);
        System.out.println(Arrays.toString(result3));

        int[] result4 = hashing(listnumber,m2);
        System.out.println(Arrays.toString(result4));
        
    }
    static int[] hashing(int[] arr , int m){

        int[] result = new int[m];
        for(int i=0; i<arr.length; i++){
            int n = arr[i]%m;
            if(result[n] == 0){
                result[n] = arr[i]; 
            }
            else{
                while(result[n]!=0){
                n++;
                }
                result[n]=arr[i];
            }
        }
        return result;
    }
    static String checkinHashtable(int[] result, int m, int element){
        
        int n = element%m;
        for(int i=n; i<result.length; i++){
            if(result[i]==element){
                return "YES";
            }
            else{
                while(result[i] != element){
                    if(result[i] == 0){
                        return "NO";
                    }
                    i++;
                    if(i == result.length){
                        i =0;
                    }
                }
            }
            
        }
        return "YES";
    }
}
