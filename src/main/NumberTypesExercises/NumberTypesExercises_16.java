package main.NumberTypesExercises;

import java.util.Scanner;

public class NumberTypesExercises_16 {
    /**
     * Write a Java program to check two numbers are Amicable numbers or not.
     * Amicable numbers are two different numbers so related that the sum of the proper divisors of each is equal to the other number.
     * The first ten amicable pairs are: (220, 284), (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368), (10744, 10856), (12285, 14595), (17296, 18416), (63020, 76084), and (66928, 66992).
     * Test Data
     * Input the first number: 220
     * Input the second number: 284
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = in.nextInt();
        System.out.print("Input the second number: ");
        int num2 = in.nextInt();
        int sum_num1 = 0, sum_num2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                sum_num1 += i;
        }
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0)
                sum_num2 += i;
        }
        if (sum_num1 == sum_num2)
            System.out.println("These numbers are amicable.");
        else
            System.out.println("These numbers are not amicable.");
        System.out.println("\n");
    }
}
