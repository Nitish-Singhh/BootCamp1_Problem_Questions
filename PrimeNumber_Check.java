package Bootcamp1st.Practice_Questions;

import java.util.Scanner;
//Write a program to check if a number is prime

class PrimeNumber_check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        int count=0 ;
        for (int i=1 ; i<=num; i++){
            if (num % i ==0){
                count++;
            }
        }
        if (count==2){
            System.out.println(num+" is a Prime number ");
        }
        else {
            System.out.println(num+ " is not a Prime number");
        }
    }
}