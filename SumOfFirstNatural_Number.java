package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

//write a program to find the sum of the first N natural numbers
public class SumOfFirstNatural_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num =sc.nextInt();
        int sum =0;
        for (int i=1; i<=num; i++){
            sum = sum +i;
        }
        System.out.println("The sum of First " + num + " Natural Number is : "+ sum);

        sc.close();
    }
}
