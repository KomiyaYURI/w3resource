package main.DataTimeTypesExercises;

import java.time.Instant;
//Write a Java program to get current timestamp.
public class DataTimeTypesExercises_20 {
    public static void main(String[] args) {
        Instant timestamp = Instant.now();
        System.out.println("\nCurrent Timestamp: " + timestamp+"\n");
    }
}
