package main.NumberTypesExercises;

import java.util.Scanner;

public class NumberTypesExercises_14 {
    /**
     * Write a Java program check whether a number is an Automorphic number or not. Go to the editor
     * In mathematics, an automorphic number is a number whose square "ends" in the same digits as the number itself. For example, 52 = 25, 62 = 36, 762 = 5776, and 8906252 = 793212890625, so 5, 6, 76 and 890625 are all automorphic numbers.
     * Expected Output
     * Input a number : 76
     * Automorphic Number.
     */
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = sc.nextInt();
        int sq_num = num*num;

        String str_num = Integer.toString(num);
        String square = Integer.toString(sq_num);

        if(square.endsWith(str_num))
            System.out.println("Automorphic Number.");
        else
            System.out.println("Not an Automorphic Number.");
    }
}
