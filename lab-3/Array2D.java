package com.codewithvishal;

public class Array2D {

    int mrows;
    int mcolumn;
    int[][] arr;
    public Array2D(int mr, int mc ){
        this.mrows =mr;
        this.mcolumn = mc;
        this.arr = new int[mr][mc];
        for(int i=0;i<mr;i++){
            for(int j=0;j<mc;j++){
                this.arr[i][j]=0;
            }
        }
    }
    public void PrintMatrix(){
        for(int i=0;i<mrows;i++){
            for(int j=0;j<mcolumn;j++){

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
    public int numRows(){
        return mrows;
    }
    public int numColumns(){
        return mcolumn;
    }
    public void clear(int value) {
        for (int i = 0; i < mrows; i++) {
            for (int j = 0; j < mcolumn; j++) {
                arr[i][j] = value;
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public int getitem(int i1 ,int i2){
        return arr[i1][i2];
    }
    public void setitem(int i1,int i2, int value){
        arr[i1][i2]=value;
    }
}