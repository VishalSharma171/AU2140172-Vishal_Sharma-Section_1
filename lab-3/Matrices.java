package com.codewithvishal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Matrices {
    int mrows,mcolumn;

    List<List<Integer>> list = new ArrayList<>();

    int[][] arr;
    public Matrices(int mr, int mc){
        this.mrows = mr;
        this.mcolumn = mc;
        this.arr = new int[mrows][mcolumn];

    }

    public int[][] return_transpose(){
        int[][] trans_arr = new int[mcolumn][mrows];
        for (int i = 0; i < list.size(); i++) {
            int row_index = list.get(i).get(0);
            int col_index = list.get(i).get(1);
            int val = list.get(i).get(2);
            trans_arr[row_index][col_index] = val;
        }
        return trans_arr;
    }

    public void converts_Original_SparseMatrix_to_Matrix(){

        for (int i = 0; i < list.size(); i++) {
            int row_index = list.get(i).get(0);
            int col_index = list.get(i).get(1);
            int val = list.get(i).get(2);
            arr[row_index][col_index] = val;
        }
    }

    public int[][] convert_SparseMatrix_to_Matrix_(int[][] mat){

        for (int i = 0; i < list.size(); i++) {
            int row_index = list.get(i).get(0);
            int col_index = list.get(i).get(1);
            int val = list.get(i).get(2);
            mat[row_index][col_index] = val;
        }
        return mat;
    }
    public void printMatrix(){
        for (int i = 0; i < mrows; i++) {
            for (int j = 0; j < mcolumn; j++) {
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
        return mcolumn;
    }

    public void setItem(int row, int col, int scaler){

        try {
            if(scaler != 0){
                arr[row][col] = scaler;
                List ladd = Arrays.asList(row,col,scaler);
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

    public Integer getItem(int row, int col){

        try{
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).get(0) == (Integer)row && list.get(i).get(1) == (Integer)col){
                    return list.get(i).get(2);
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid index input");
        }

        return -1;
    }

    public void scaleBy(int scaler){

        for (int i = 0; i < list.size(); i++) {

            list.get(i).set(2,list.get(i).get(2)*scaler);
        }
        converts_Original_SparseMatrix_to_Matrix();
    }

    public int[][] transpose(){

        for (int i = 0; i < list.size(); i++) {
            int row_index = list.get(i).get(0);
            int col_index = list.get(i).get(1);
            list.get(i).set(0,col_index);
            list.get(i).set(1,row_index);
        }
        int[][] trans = return_transpose();
        return trans;
    }

    public int[][] add(int[][] rhsmatrix){

        if(rhsmatrix.length == arr.length && rhsmatrix[0].length == arr[0].length) {

            int[][] add = new int[rhsmatrix.length][rhsmatrix[0].length];

            for (int i = 0; i < list.size(); i++) {
                int row_index = list.get(i).get(0);
                int col_index = list.get(i).get(1);
                int val = list.get(i).get(2);
                list.get(i).set(2, rhsmatrix[row_index][col_index] + val);
            }

            for (int i = 0; i < rhsmatrix.length; i++) {

                for (int j = 0; j < rhsmatrix[0].length; j++) {
                    if(add[i][j] == 0){
                        if(rhsmatrix[i][j] !=0){
                            add[i][j] = rhsmatrix[i][j];
                        }
                    }
                }
            }
            return convert_SparseMatrix_to_Matrix_(add);
        }
        else {
            System.out.println("Addition Not possible");
            int[][] invalid = {{-1}};
            return invalid;
        }
    }

    public int[][] sub(int[][] rhsmatrix){

        if(rhsmatrix.length == arr.length && rhsmatrix[0].length == arr[0].length) {

            int[][] sub = new int[rhsmatrix.length][rhsmatrix[0].length];

            for (int i = 0; i < list.size(); i++) {
                int row_index = list.get(i).get(0);
                int col_index = list.get(i).get(1);
                int val = list.get(i).get(2);
                list.get(i).set(2, rhsmatrix[row_index][col_index] - val);
            }

            for (int i = 0; i < rhsmatrix.length; i++) {

                for (int j = 0; j < rhsmatrix[0].length; j++) {
                    if(sub[i][j] == 0){
                        if(rhsmatrix[i][j] !=0){
                            sub[i][j] = rhsmatrix[i][j];
                        }
                    }
                }
            }
            return convert_SparseMatrix_to_Matrix_(sub);
        }
        else {
            System.out.println("Addition Not possible");
            int[][] invalid = {{-1}};
            return invalid;
        }



    }

}

