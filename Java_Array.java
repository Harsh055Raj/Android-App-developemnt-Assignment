package com.harsh;

public class Java_Array {
    public static void main(String[] args) {
        // Removing the duplicate value in array
        int[] arr = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int n=arr.length;
        if (n==0 || n==1){
             System.out.println(n);
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        //
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        System.out.println("The duplicate removed array is ");
        for (int i=0; i<arr.length; i++)
            System.out.print(arr[i]+" ");

        ///  Second Left shift Array
        System.out.println("The original array is");
        int[] arr1 = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        int first = arr1[0];
        for (int j1 = 0; j1 < arr1.length - 1; j1++) {
            arr1[j1] = arr1[j1 + 1];
        }
        arr1[arr1.length] = first;
        System.out.println("The new array with a left shift is ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");



        }
        // Third Finding the third largest element of an array
        int[] arra2={2,5,6,7,1};
        int temp2;
        for(int i=0;i<arra2.length;i++){
            for(int j2=i+1;j2< arra2.length;j2++){
                if(arra2[i]>arra2[j2]){
                    temp2 = arra2[i];
                    arra2[i] = arra2[j2];
                    arra2[j2] = temp2;
                }
            }
        }
        System.out.println(arra2[arra2.length-3]);



    }
}
