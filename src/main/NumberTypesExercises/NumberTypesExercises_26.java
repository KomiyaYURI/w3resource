package main.NumberTypesExercises;

import java.util.Scanner;

public class NumberTypesExercises_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        int n1 = n;
        String s = Integer.toString(n);
        int d=s.length();
        int arr[]=new int[n];
        int i, sum;
        for(i=d-1; i>=0; i--)
        {
            arr[i]=n1 % 10;
            n1=n1/10;
        }
        i=d; sum=0;
        while(sum<n)
        {
            sum = 0;
            for(int j=1; j<=d; j++)
            {
                sum=sum+arr[i-j];
            }
            arr[i]=sum;
            i++;
        }
        if(sum==n)
            System.out.println("Keith Number");
        else
            System.out.println("Not a Keith Number");
    }
}
/**
 Write a Program in Java to check whether a number is a Keith Number or not. Go to the editor
 In recreational mathematics, a Keith number or repfigit number
 (short for repetitive Fibonacci-like digit) is a number in the following integer sequence:
 14, 19, 28, 47, 61, 75, 197, 742, 1104, 1537, 2208, 2580, 3684, 4788, 7385,
 7647, 7909, 31331, 34285, 34348, 55604, 62662, 86935, 93993, 120284, 129106,
 147640, 156146, 174680, 183186, 298320, 355419, 694280, 925993,
 Expected Output
 Input a number: 75
 Keith Number
 */