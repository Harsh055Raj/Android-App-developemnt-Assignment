package com.harsh;

import java.util.Scanner;

public class Assignment1_J011_Harsh_Raj {
    public static void main(String[] args) {
        // 1.Question one checking for Neon Number
        Scanner Harsh = new Scanner(System.in);
        // Taking the number for checking the neon number
        System.out.println("Enter the number ");
        int n = Harsh.nextInt();
        int sum = 0;
        int sq = n * n;
        while (sq > 0) {
            int val = sq % 10;
            sum = sum + val;
            sq = sq / 10;
        }
        // Checking if the sum of Digit of the number square is equal to that number
        if (n == sum) {
            System.out.println("It is an neon number ");
        } else {
            System.out.println("Its is not a neon number");
        }
        ///

        // Question 2  Checking for armstrong number

        Scanner Harsh3 = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n1 = Harsh3.nextInt();
        int k = n1;
        int arm = 0;
        while (n1 > 0) {
            int digit = n1 % 10;
            int cube = digit * digit * digit;
            arm = arm + cube;
            n1 = n1 / 10;
        }
        if (arm == k) {
            System.out.println("It is an armstrong number");
        } else {
            System.out.println("Number is not an armstrong number");
        }
        /////
        /// Question 3  ISBN NUMBER
        // Solving this question with the help of Array to take input and processing it

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        Scanner Harsh4 = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {

            array[i] = Harsh4.nextInt();
        }

        int sum2 = 0;
        int k2 = 1;
        for (int i = 0; i < 9; i++) {
            sum2 = array[i] * k + sum2;
            ++k2;

        }
        if (sum2 % 11 == 0) {
            System.out.println("It is an ISBN number ");
        } else {
            System.out.println("It is not an ISBN number");
        }
    }
}
