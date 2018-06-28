package main.NumberTypesExercises;

import java.math.BigInteger;
import java.util.Scanner;

public class NumberTypesExercises_19 {
   /** Write a Java program to check a number is a cyclic or not. Go to the editor
    A cyclic number is an integer in which cyclic permutations of the digits are successive multiples of the number. The most widely known are 142857:
            142857 × 1 = 142857
            142857 × 2 = 285714
            142857 × 3 = 428571
            142857 × 4 = 571428
            142857 × 5 = 714285
            142857 × 6 = 857142
    Input Data:
    Input a number: 142857
    Expected Output
    It is a cyclic number.*/
   public static void main( String args[] ){
       Scanner sc = new Scanner( System.in );
       System.out.print("Input a number: ");
       String strnum = sc.nextLine().trim();
       BigInteger n = new BigInteger(strnum);
       int len = strnum.length()+1;
       String str = String.valueOf(len);
       BigInteger n1 = new BigInteger(str);
       StringBuilder buf = new StringBuilder();
       for(int i = 0 ; i < (len-1); i++) {
           buf.append('9');
       }
       BigInteger total = new BigInteger(buf.toString());
       if(n.multiply(n1).equals(total)) {
           System.out.println("It is a cyclic number.");
       }
       else {
           System.out.println("Not a cyclic number.");
       }
   }
}
