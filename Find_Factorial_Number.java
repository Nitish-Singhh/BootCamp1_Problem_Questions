package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

public class Find_Factorial_Number {
   public static int Factorial(int n){
       if (n == 0 || n == 1)
           return 1;
       else
           return n * Factorial(n - 1);

   }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Number ");
        int num =sc.nextInt();

       int result= Factorial(num);
        System.out.println(result);
    }
}
