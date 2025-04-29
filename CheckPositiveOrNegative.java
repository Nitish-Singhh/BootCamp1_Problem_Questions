package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

//Write a program to check if a number is positive, negative, or zero

public  class CheckPositiveOrNegative  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num =sc.nextInt();
        if (num< 0 ){
            System.out.println("Number is 'Negative' ");
        } else if (num > 0) {
            System.out.println("Number is 'positive' ");
        }
        else {
            System.out.println("Number is 'Zero' ");
        }
    }
}