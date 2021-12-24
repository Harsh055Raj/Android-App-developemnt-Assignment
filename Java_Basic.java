package com.harsh;
import java.util.Scanner;
public class Java_Basic {
    public  void main(String[] args){
        // First Printing the factorial
        int num = 10;
        long factorial = 1;
        for(int i = 1; i <= num; ++i)
        {
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
        // Second Checking if prime number or not
        Scanner Harsh=new Scanner(System.in);
        System.out.println("Enter the Number to check whether its prime or not");
        int a=Harsh.nextInt();
        System.out.println("Enter the Number to create the lstar pattern");

        int b=Harsh.nextInt();
        L_Star_Pattern(b);
        Prime_Number(a);

    }
    public String Prime_Number(int k){
        int result=0;
        String val="It is an prime number";
        String val2="Its not a prime number";
        for(int i=1;i==k;i++){
            if(k%i==0){
                result++;
            }else{
                continue;
            }
        }
        if(result>2){
            return val;
        }else{
            return val2;
        }
    }
    //Printing L star pattern
    public String L_Star_Pattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 2 * (n - 1); j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print("* ");
            }
        }
        String k = ("You got the pattern ");
        return k;

    }

}
