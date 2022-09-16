/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_4;
import java.util.*;
/**
 *
 * @author Vishal Sharma
 */
public class Postfix {
    public static int Result(String str){

        Stack s1 = new Stack();

        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/'){
                int num1 = s1.pop();
                int num2 = s1.pop();

                if(str.charAt(i) == '+'){
                    int nm = num1 + num2;
                    s1.push(nm);
                }
                if(str.charAt(i) == '-'){
                    int sub = num2-num1;
                    s1.push(sub);
                }

                if(str.charAt(i) == '*'){
                    int Multi = num1*num2;
                    s1.push(Multi);
                }

                if(str.charAt(i) == '/'){
                    int div = num2/num1;
                    s1.push(div);
                }
            }
            else {
                int a = Character.getNumericValue(str.charAt(i));
                s1.push(a);
            }

        }

        return s1.peek();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String str = sc.next();

        str = str.replaceAll("\\s","");

        System.out.println(Result(str));

    }
}
