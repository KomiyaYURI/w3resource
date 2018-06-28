package main.DataTimeTypesExercises;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataTimeTypesExercises_29 {
    public static void main(String[] args) {
        String string = "May 1, 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println();
        System.out.println(date);
        System.out.println();
    }
}
