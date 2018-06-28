package main.NumberTypesExercises;

import java.util.Scanner;

/**
 Write a Java program to check a number is a cube or not.

 In arithmetic and algebra, the cube of a number n is its third power: the result of the number multiplied by itself twice:
 n3 = n × n × n
 Input Data:
 Input a number: 8
 */
public class NumberTypesExercises_18 {


    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int num = sc.nextInt();
        int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
        {
            System.out.print("Number is a cube.");
        }
        else
        {
            System.out.print("Number is not a cube.");
        }
        System.out.println("\n");
    }

}
