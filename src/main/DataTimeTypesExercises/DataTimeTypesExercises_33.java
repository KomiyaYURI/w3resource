package main.DataTimeTypesExercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

//Write a Java program to get the next and previous Friday.
public class DataTimeTypesExercises_33 {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.now();
        System.out.println("\nNext Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
    }
}

