package com.codewithvishal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void printMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {

//           Array2D arr1 = new Array2D(2,3);
//            arr1.PrintMatrix();
//        System.out.println(arr1.numRows());
//        System.out.println(arr1.numColumns());
//        arr1.clear(1);
//        System.out.println(arr1.getitem(1, 1));
//        arr1.setitem(0,1,4);
//        arr1.PrintMatrix();
//
//
//
//
//        Array2D_Sparse x1 = new Array2D_Sparse(2,3);
//
//        for (int i = 0; i < x1.mrows; i++) {
//            for (int j = 0; j < x1.mcols; j++) {
//                Scanner sc = new Scanner(System.in);
//                System.out.print("Enter value at position "+i+" , "+j+" : ");
//                x1.setItem(i,j,sc.nextInt());
//                System.out.println();
//
//            }
//        }
//        x1.setItem(0,0,0);
//        System.out.println(x1.getItem(1,1));
//        x1.print_2D_Array();
//        x1.printL();


        Matrices m1 = new Matrices(2, 3);

        for (int i = 0; i < m1.mrows; i++) {
            for (int j = 0; j < m1.mcolumn; j++) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter value at position " + i + " , " + j + " : ");
                m1.setItem(i, j, sc.nextInt());
                System.out.println();

            }
        }

//        m1.scaleBy(2);
//        m1.printL();
//        m1.printMatrix();
//
//        m1.printMatrix();
//        m1.printMatrix();
//        System.out.println();
//        m1.printL();
//
//        int[][] trans = m1.transpose();
//        System.out.println();
//        m1.printL();
//        printMatrix(trans);

        int[][] rhsMatrix = {
                {0, 1, 3},
                {0, 1, 2}
        };
        m1.printMatrix();
        System.out.println();
        printMatrix(rhsMatrix);
        System.out.println();
        int[][] sum = m1.add(rhsMatrix);
        printMatrix(sum);


//        Scanner sc = new Scanner(System.in);
//        int rows = 10;
//        int cols = 10;
//        LifeGrid lifeGrid = new LifeGrid(rows, cols);
//        int[][] coordlist = {{1, 3}, {1, 4}, {2, 4}, {5, 3}, {5, 4}, {6, 2}, {6, 3}, {7, 5}, {8, 4}};
////      int[][] coordlist = {{3,1},{3,2},{3,3}};
//        lifeGrid.configure(coordlist);
//        lifeGrid.printgrid();
//        System.out.print("Enter row number to clear cell => ");
//        int row = sc.nextInt();
//        System.out.print("Enter column number to clear cell => ");
//        int col = sc.nextInt();
//        lifeGrid.clearCell(row, col);
//        System.out.println("New grid => ");
//        lifeGrid.printgrid();
//        System.out.print("Enter row number to check cell=> ");
//        int i1 = sc.nextInt();
//        System.out.print("Enter col number to check cell => ");
//        int i2 = sc.nextInt();
//        boolean alive = lifeGrid.isAlive(i1, i2);
//        System.out.println("alive = " + alive);
//        System.out.println("Enter row number to check number of alive neighbours => ");
//        int rowTocheck = sc.nextInt();
//        System.out.println("Enter column number to check number of alive neighbours => ");
//        int colTocheck = sc.nextInt();
//        int numLiveNeighbors = lifeGrid.numLiveNeighbors(rowTocheck, colTocheck);
//        System.out.println("numLiveNeighbors = " + numLiveNeighbors);
//        lifeGrid.step();
//        System.out.println("Next grid => ");
//        lifeGrid.printgrid();
//
//    }
//
    }
}

