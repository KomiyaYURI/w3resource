package main.NumberTypesExercises;

import java.util.Scanner;

public class NumberTypesExercises_22 {
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        int n1 = n + 1;

        int power = 0;
        int ans = 0;
        for(int i=0;;i++)
        {
            power=(int)Math.pow(2,i);
            if(power>n1)
            {
                break;
            }
            else if(power==n1)
            {
                System.out.println(n+" is a Mersenne number.");
                ans=1;
            }
        }
        if(ans==0)
        {
            System.out.println(n+" is not a Mersenne number.");
        }
    }
}
/**
 Write a program to check if a number is Mersenne number or not. Go to the editor
 In mathematics, a Mersenne number is a prime number that can be written in the form Mn = 2n − 1 for some integer n.
 The first four Mersenne primes are 3, 7, 31, and 127

 Expected Output
 Input a number: 127
 127 is a Mersenne number.

 */