package main.NumberTypesExercises;


/**
 * Write a Java program to generate and show the first 15 narcissistic decimal numbers.
 *
 * A Narcissistic decimal number is a non-negative integer, n that is equal to the sum of the m-th powers of each of the digits in the decimal representation of n, where m is the number of digits in the decimal representation of n.
 * if n is 153
 * then m , (the number of decimal digits) is 3
 * we have 13 + 53 + 33 = 1 + 125 + 27 = 153
 * and so 153 is a narcissistic decimal number .
 *
 * Narcissistic numbers in various bases :
 * The sequence of base 10 narcissistic numbers starts: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, ……
 * The sequence of base 8 narcissistic numbers starts: 0, 1, 2, 3, 4, 5, 6, 7, 24, 64, 134, 205,….
 */
public class NumberTypesExercises_6 {

    public static void main(String[] args){
        for(long n = 0, ctr = 0; ctr < 15; n++){
            if(is_narc_dec_num(n)){
                System.out.print(n + " ");
                ctr++;
            }
        }
        System.out.println();
    }
    public static boolean is_narc_dec_num(long n){
        if(n < 0) return false;

        String str1 = Long.toString(n);
        int x = str1.length();
        long sum_num = 0;

        for(char c : str1.toCharArray()){
            sum_num += Math.pow(Character.digit(c, 10), x);
        }
        return sum_num == n;
    }

}
