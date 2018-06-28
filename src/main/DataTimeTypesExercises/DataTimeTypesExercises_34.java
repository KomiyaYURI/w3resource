package main.DataTimeTypesExercises;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DataTimeTypesExercises_34 {
    public static void main(String[] args) {
        //Write a Java program to get today's date at midnight time.
        Calendar cal = new GregorianCalendar();
        cal.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        System.out.println("\n"+cal.getTime()+"\n");
    }
}
