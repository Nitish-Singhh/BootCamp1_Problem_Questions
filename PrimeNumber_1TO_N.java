package Bootcamp1st.Practice_Questions;

import java.util.Scanner;
//Write a program to generate all prime numbers between 1 and N
public class PrimeNumber_1TO_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Prime numbers from 1 to " + n + " are:");
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
