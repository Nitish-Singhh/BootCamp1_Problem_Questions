package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

public class ReverseArray {
    public static void Reverse(int[] arr){
        int start =0;
        int last = arr.length-1;
        while (start< last){
            int temp ;
            temp = arr[start];
            arr[start]= arr[last];
            arr[last]= temp;

            start++;
            last--;
        }
        System.out.println("The Reverse array is : ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Elements ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr);

        sc.close();
    }
}
