package com.harsh;

public class Java_Matrix {
    public static void main(String[] args) {
        /// Summation of two matrix
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{5, 6}, {7, 8}};
        int new1[][] = new int[2][2];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                new1[i][j] = a[i][j] + b[i][j];
                System.out.println(new1[i][j]);

            }
        }
        /// Transpose of Matrix
        int transpose[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transpose[i][j] = a[j][i];


            }
        }
        System.out.println("The tranpose matrix is ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(transpose[i][j]);

            }
            System.out.println();
        }
        // Checking For Identity Matrix
        int identity[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int row=identity.length;
        boolean val=true;
        int col=identity[0].length;
        if(row!=col){
            System.out.println("Its not a identity matrix");
        }else{
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if(i==j&& identity[i][j]!=1){
                        val=false;

                    }else if(identity[i][j]!=0){
                        val=false;

                    }


                }
            }

        }
        if(val){
            System.out.println("Its an Identity Matrix");
        }else{
            System.out.println("Its not an identity matrix");
        }

    }
}

