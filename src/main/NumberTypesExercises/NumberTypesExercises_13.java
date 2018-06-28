package main.NumberTypesExercises;

import java.util.Scanner;

/**
 * Write a Java program to check whether a number is a Pronic Number or Heteromecic Number or not. Go to the editor
 * A pronic number is a number which is the product of two consecutive integers, that is, a number of the form n(n + 1).
 * The first few pronic numbers are:
 * 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240, 272, 306, 342, 380, 420, 462 … etc.
 *
 * Expected Output
 * Input a number : 110
 * Pronic Number.
 */
public class NumberTypesExercises_13 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int ans = 0;

        for(int i=0; i<num; i++)
        {
            if(i*(i+1) == num)
            {
                ans = 1;
                break;
            }
        }

        if(ans == 1)
            System.out.println("Pronic Number.");
        else
            System.out.println("Not a Pronic Number.");
    }
}
