package main.NumberTypesExercises;

import java.util.LinkedList;

public class NumberTypesExercises_23 {

    public static void main(String args[]) {
        for (int i = 1; i < 1000; i++) {
            int n = i;
            LinkedList<Integer> data = new LinkedList<>();
            while (n > 0) {
                data.push(n % 10);
                n = n / 10;
            }
            int n1 = 0;
            for (Integer num : data) {
                n1 += Math.pow(num, data.size());
            }
            if (i == n1) {
                System.out.println(i);
            }
        }


    }
}
/**
 Write a Java program to find all the narcissistic numbers between 1 and 1000. Go to the editor
 In number theory, a narcissistic number is a number that is the sum of its own digits each raised to the power of the number of digits.
 For example:
 153 = 13 + 53 + 33

 Expected Output
 1
 2
 3
 4
 5
 6
 7
 8
 9
 153
 370
 371
 407
 */