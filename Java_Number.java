package com.harsh;
import java.util.Scanner;

public class Java_Number {
    public static void main(String[] args) {

        // Tech Number
        Scanner Harsh = new Scanner(System.in);
        int num = Harsh.nextInt();
        int k = num;
        int newa = 0;
        int newb = 0;
        int i = 0;

        while (num > 0) {
            if (i % 2 == 0) {
                newa = newa + num % 10;
                i++;
                num = num / 10;


            } else {
                newb = newb + num % 10;
                i++;
                num = num / 10;
            }


        }
        int tech = newb * 10 + newa;
        int sqr = tech * tech;
        if (sqr == k) {
            System.out.println("It is a tech number ");
        } else {
            System.out.println("It is not a tech number ");
        }

        //// ATM MACHINE SIMULATOR
        int balance=100,withdraw,remaining;
        System.out.println("Enter 1 for withdrawal ,2 to check the balance");
        Scanner Harsh2=new Scanner(System.in);
        int choice=Harsh.nextInt();
        switch(choice)
        {
            case 1:
                System.out.println("Enter the money u want to withdraw");
                withdraw=Harsh2.nextInt();
                if(withdraw>balance){
                    System.out.println("Insufficient Balance");

                }else {
                    balance=balance-withdraw;
                    System.out.println("Money withdrawn ");
                }
                break;
            case 2:
                System.out.println("Your Balance it"+balance);
                break;


        }

        //// BUZZ NUMBER :
        System.out.println("Enter the number of which u want to check for buzz condition");
        Scanner Harsh3= new Scanner(System.in);
        int n3=Harsh3.nextInt();
        int ans=n3%10;
        if(n3/7==0){
            System.out.println("It is a Buzz number ");

        }else if(ans==7){
            System.out.println("It is a Buzz number");


            }else {
            System.out.println("It is not a Buzz NUmber");
        }

    }
}
