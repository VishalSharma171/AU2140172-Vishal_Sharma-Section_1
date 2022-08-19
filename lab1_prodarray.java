/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vishal Sharma
 */
public class lab1_prodarray {
    static int arr[] = {1, 2, 3, 4};
     
    
    static int multiply(int a[], int n)
    {
       
        if (n == 0)
            return(a[n]);
        else
            return (a[n] * multiply(a, n - 1));
    }
     
    
    public static void main(String[] args)
    {
        
        System.out.println(multiply(arr,
                       arr.length - 1));
        }
}
    
    

