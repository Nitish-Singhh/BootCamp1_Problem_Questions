package Bootcamp1st.Practice_Questions;

import java.util.Scanner;

//Write a program to find the largest of three numbers

public class Find_Largest_Number {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Numbers here :");
        System.out.println("Enter First Number :");

        int first =sc.nextInt();
        System.out.println("Enter Second Number :");
        int sec =sc.nextInt();
        System.out.println("Enter Third Number : ");
        int third =sc.nextInt();
       int largest;
        System.out.println("The Largest Number among Three is ");
      if (first> sec && first > third){
          largest =first;
          System.out.println("First number is Largest Number "+ largest);
      } else if (sec> first && sec> third) {
          largest =sec;
          System.out.println("Second Number is Largest :"+ largest);

      }
      else {
          largest =third;
          System.out.println("Third Number is Largest "+ largest);
      }

      sc.close();
    }
}
