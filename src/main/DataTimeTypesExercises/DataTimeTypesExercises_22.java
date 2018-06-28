package main.DataTimeTypesExercises;

import java.time.LocalDate;

//Write a Java program to get the dates 10 days before and after today.
public class DataTimeTypesExercises_22 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("\nCurrent Date: "+today);
        System.out.println("10 days before today will be "+today.plusDays(-10));
        System.out.println("10 days after today will be "+today.plusDays(10)+"\n");
    }
}
