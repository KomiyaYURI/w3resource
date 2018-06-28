package main.NumberTypesExercises;

import java.util.Scanner;

/**
 *Write a Java program to check whether a given number is a Disarium number or unhappy number. Go to the editor
 * A Disarium number is a number defined by the following process :
 * Sum of its digits powered with their respective position is equal to the original number.
 * For example 175 is a Disarium number :
 * As 11+32+53 = 135
 * Some other DISARIUM are 89, 175, 518 etc.
 * A number will be called Disarium if the sum of its digits powered with their respective
 * position is equal with the number itself. Sample Input: 135.
 * Expected Output
 *
 * Input a number : 25
 * Not a Disarium Number.
 */
public class NumberTypesExercises_11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int copy = num, d = 0, sum = 0;
        String s = Integer.toString(num);
        int len = s.length();

        while(copy>0)
        {
            d = copy % 10;
            sum = sum + (int)Math.pow(d,len);
            len--;
            copy = copy / 10;
        }

        if(sum == num)
            System.out.println("Disarium Number.");
        else
            System.out.println("Not a Disarium Number.");
    }
}
