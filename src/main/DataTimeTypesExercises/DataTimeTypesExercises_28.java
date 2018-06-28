package main.DataTimeTypesExercises;

import java.time.LocalDateTime;

//Write a Java program to display the date time information
// before some hours and minutes from current date time
public class DataTimeTypesExercises_28 {

    public static void main(String[] args) {

        // Before 7 houres and 30 minutes
        LocalDateTime dateTime = LocalDateTime.now().minusHours(5).minusMinutes(30);
        System.out.println("\nCurrent Date and Time:  " + LocalDateTime.now());
        System.out.println("Before 5 houres and 30 minutes: " + dateTime+"\n");
    }
}
