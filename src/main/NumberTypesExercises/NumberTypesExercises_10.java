package main.NumberTypesExercises;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberTypesExercises_10 {
    /**
     * Write a Java program to check whether a given number is a happy number or unhappy number.
     *
     * Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
     * An unhappy number is a number that is not happy.
     * The first few unhappy numbers are 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20.
     */

        public static boolean isHappy_number(int num)
        {
            Set<Integer> unique_num = new HashSet<Integer>();

            while (unique_num.add(num))
            {
                int value = 0;
                while (num > 0)
                {
                    value += Math.pow(num % 10, 2);
                    num /= 10;
                }
                num = value;
            }

            return num == 1;
        }

        public static void main(String[] args)
        {
            System.out.print("Input a number: ");
            int num = new Scanner(System.in).nextInt();
            System.out.println(isHappy_number(num) ? "Happy Number" : "Unhappy Number");
        }

}
