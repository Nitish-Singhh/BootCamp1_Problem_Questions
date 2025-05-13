package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

public class PrintN_TO_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Number : ");

        int num = sc.nextInt();

        for (int i = num; i>0; i--){
            System.out.print(i+ " ");
        }
        sc.close();
    }
}
