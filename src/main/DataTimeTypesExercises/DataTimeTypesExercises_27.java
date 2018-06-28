package main.DataTimeTypesExercises;

import java.time.LocalTime;
//Write a Java program to get the information of a given time.
public class DataTimeTypesExercises_27 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12, 24, 32);
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        System.out.println("\nCurrent Local time: " + time);
        System.out.println("Hour: " + hour);
        System.out.println("Minue: " + minute);
        System.out.println("Second: " +second+"\n");
    }
}
