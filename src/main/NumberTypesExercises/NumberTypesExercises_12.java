package main.NumberTypesExercises;

import java.util.Scanner;

/**
 *  Write a Java program to check whether a number is a Harshad Number or not. Go to the editor
 * In recreational mathematics, a harshad number in a given number base, is an integer that is divisible by the sum of its digits when written in that base.
 * Example: Number 200 is a Harshad Number because the sum of digits 2 and 0 and 0 is 2(2+0+0) and 200 is divisible by 2. Number 171 is a Harshad Number because the sum of digits 1 and 7 and 1 is 9(1+7+1) and 171 is divisible by 9.
 * Expected Output
 * Input a number : 353
 * 353 is not a Harshad Number.
 */
public class NumberTypesExercises_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int x = num, y, sum = 0;

        while(x>0)
        {
            y = x%10;
            sum = sum + y;
            x = x/10;
        }

        if(num%sum == 0)
            System.out.println(num+" is a Harshad Number.");
        else
            System.out.println(num+" is not a Harshad Number.");
    }
}
