/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6_hasing;
import java.util.HashMap;
/**
 *
 * @author Vishal Sharma
 */
public class Q5 {
    
    static HashMap<Character,Integer> ShowHashingValues(String str,int M){

        HashMap<Character,Integer> result = new HashMap<>();

        for (int j = 0; j < str.length(); j++) {

            int Ascii = (int)str.charAt(j);
            
            result.put(str.charAt(j),Ascii%M);

        }

        return result;
    }
    static void ShowPolynomial(String s){

        for (int i = 0; i < s.length(); i++) {

            int coefficient = (int)s.charAt(i);

            System.out.print(coefficient);
            System.out.print("a^");
            System.out.print((s.length()-i-1));
            if(i == s.length()-1){
                
                break;
                
            }
            
            System.out.print(" + ");
            
        }
        
        System.out.println();
    }
    public static void main(String[] args) {

        String S1 = "fist";
        String S2 = "sift";
        String S3 = "shift";
        String S4 = "fast";
        String S5 = "shaft";

        int M1 = 17;
        int M2 = 37;

        ShowPolynomial(S1);
        ShowPolynomial(S2);
        ShowPolynomial(S3);
        ShowPolynomial(S4);
        ShowPolynomial(S5);

        System.out.println();
        System.out.println(ShowHashingValues(S1,M1));
        System.out.println(ShowHashingValues(S1,M2));
        System.out.println();
        
        System.out.println(ShowHashingValues(S2,M1));
        System.out.println(ShowHashingValues(S2,M2));
        System.out.println();
        
        System.out.println(ShowHashingValues(S3,M1));
        System.out.println(ShowHashingValues(S3,M2));
        System.out.println();
        
        System.out.println(ShowHashingValues(S4,M1));
        System.out.println(ShowHashingValues(S4,M2));
        System.out.println();
        
        System.out.println(ShowHashingValues(S5,M1));
        System.out.println(ShowHashingValues(S5,M2));


    }
}


