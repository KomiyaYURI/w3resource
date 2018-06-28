package main.DataTimeTypesExercises;

import java.time.Year;

/**
 * Write a Java program to get the information of current/given year.
 * Sample format:
 * Current Year: 2001
 * Is current year leap year? false
 * Length of the year: 365 days
 */
public class DataTimeTypesExercises_25 {
    public static void main(String[] args) {
        //Current year
        Year yr = Year.now();
        //given year
        //Year yr = Year.of(2001);
        System.out.println("\nCurrent Year: " + yr);
        boolean isLeap = yr.isLeap(); // false
        System.out.println("Is current year leap year? " + isLeap);
        int length = yr.length(); // 365
        System.out.println("Length of the year: " + length+" days\n");
    }
}
