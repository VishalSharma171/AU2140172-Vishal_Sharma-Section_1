package com.codewithvishal;
import java.util.Arrays;
import java.util.Scanner;
public class LifeGrid {





        int lifegrid[][];
        int mrows;
        int mcolumn;

         LifeGrid(int rows, int cols) {
            lifegrid = new int[rows][cols];
            this.mrows = rows;
            this.mcolumn = cols;
            for (int i = 0; i < lifegrid.length; i++) {
                for (int j = 0; j < lifegrid[i].length; j++) {
                    lifegrid[i][j] = 0;
                }
            }
        }
         void configure(int[][] coordilist) {
            for (int i = 0; i < coordilist.length; i++) {
                int[] arr = coordilist[i];
                lifegrid[arr[0]][arr[1]] = 1;
            }
        }




        void printgrid() {
            System.out.println(" ------ ");
            for (int i = 0; i < lifegrid.length; i++) {
                for (int j = 0; j < lifegrid[i].length; j++) {
                    if (lifegrid[i][j] == 0) {
                        System.out.print(" . ");
                    } else {
                        System.out.print(" x ");
                    }

                }
                System.out.println();
            }
            System.out.println(" ------ ");
        }

        void clearCell(int row, int col) {
            if (row > mrows - 1 || col > mcolumn - 1) {
                System.out.println("Enter valid index.");
            } else {
                this.lifegrid[row][col] = 0;
            }
        }

        void setCell(int row, int col) {
            if (row > mrows - 1 || col > mcolumn - 1) {
                System.out.println("Enter valid index.");
            } else {
                this.lifegrid[row][col] = 1;
            }
        }

        boolean isAlive(int row, int col) {
            boolean result = false;
            if ((row > mrows - 1 && row < 0) || (col > mcolumn - 1 && col < 0)) {
                result = false;
            } else {
                if (this.lifegrid[row][col] == 1) {
                    result = true;
                }
            }
            return result;
        }

        int isExist(int x, int y) {
            if (x < 0 || x >= mcolumn) {
                return 0;
            }
            if (y < 0 || y >= mrows) {
                return 0;
            }
            return this.lifegrid[x][y];
        }

        int numLiveNeighbors(int row, int col) {
            int count = 0;
            if (row < mrows - 1 && col < mcolumn - 1) {
                count = count + isExist(row - 1, col - 1);
                count = count + isExist(row, col - 1);
                count = count + isExist(row + 1, col - 1);

                count = count + isExist(row - 1, col);
                count = count + isExist(row + 1, col);

                count = count + isExist(row - 1, col + 1);
                count = count + isExist(row, col + 1);
                count = count + isExist(row + 1, col + 1);
                return count;
            } else {
                return -1;
            }
        }

        void step() {
            int[][] new_grid = new int[mrows][mcolumn];

            for (int i = 0; i < mrows - 1; i++) {
                for (int j = 0; j < mcolumn - 1; j++) {
                    int aliveneighbours = numLiveNeighbors(i, j);
                    if (isExist(i, j) == 1) {
                        if (aliveneighbours < 2) {
                            new_grid[i][j] = 0;
                        } else if (aliveneighbours == 2 || aliveneighbours == 3) {
                            new_grid[i][j] = 1;
                        } else if (aliveneighbours > 3) {
                            new_grid[i][j] = 0;
                        }
                    } else {
                        if (aliveneighbours == 3) {
                            new_grid[i][j] = 1;
                        }
                    }
                }
            }
            this.lifegrid = new_grid;
        }
    }


