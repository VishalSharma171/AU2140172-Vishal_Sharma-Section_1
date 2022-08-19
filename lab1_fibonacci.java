


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*F(1) = 0

F(2) = 1

F(N) = F(N-1) + F(N-2)*/
/**
 *
 * @author Vishal Sharma
 */
public class lab1_fibonacci {
    
        
        public static int fibo(int n){
        
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        else if(n<=0){
            System.out.println("Error");
            return -1;
        }
        else{
            
        return fibo(n-1)+fibo(n-2);
        }
        
    }
    
    public static void main(String[] args) {
        
        int x = fibo(5);
        
        System.out.println(x);
    }
    
    
}
