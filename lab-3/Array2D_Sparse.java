package com.codewithvishal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Array2D_Sparse {
    int mrows,mcols;

    List<List<Integer>> list = new ArrayList<>();

    int[][] arr;
    public Array2D_Sparse(int mr, int mc) {
        this.mrows = mr;
        this.mcols = mc;

        this.arr = new int[mrows][mcols];

    }
    public void print_2D_Array(){
        for (int i = 0; i < mrows; i++) {
            for (int j = 0; j < mcols; j++) {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }

    public void printL(){

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public int numRows(){
        return mrows;
    }

    public int numCols(){
        return mcols;
    }

    public void clear(int value){
        for (int i = 0; i < mrows; i++) {

            for (int j = 0; j < mcols; j++) {

                arr[i][j] = value;

            }
        }
    }

    public void setItem(int i1, int i2, int value){

        try {
            if(value != 0){
                arr[i1][i2] = value;
                List ladd = Arrays.asList(i1,i2,value);
                list.add(ladd);
            }
            else {
                System.out.println("Cannot take O as an Input in sparse matrix");
                return;
            }
        } catch (Exception e) {
            System.out.println("Invalid index input");

        }

    }

    public Integer getItem(int i1, int i2){

        try{
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).get(0) == (Integer)i1 && list.get(i).get(1) == (Integer)i2){
                    return list.get(i).get(2);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid index input");
        }

        return -1;
    }



}

