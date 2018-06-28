package main.DataTimeTypesExercises;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Write a Java program to display the dates in the specified formats.
 *
 * Sample format:
 *
 * Default format of LocalDate=2016-09-16
 * 16::Sep::2016
 * Default format of LocalDateTime=2016-09-16T11:46:01.455
 * 16::Sep::2016 11::46::01
 * Default format of Instant=2016-09-16T06:16:01.456Z
 * Default format after parsing = 2014-04-27T21:39:48

 */
public class DataTimeTypesExercises_24 {
    public static void main(String[] args) {
        //Format examples
        LocalDate date = LocalDate.now();
        //default format
        System.out.println("Default format of LocalDate="+date);
        //specific format
        System.out.println(date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));

        LocalDateTime dateTime = LocalDateTime.now();
        //default format
        System.out.println("Default format of LocalDateTime="+dateTime);
        //specific format
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
        Instant timestamp = Instant.now();
        //default format
        System.out.println("Default format of Instant="+timestamp);

        //Parse examples
        LocalDateTime dt = LocalDateTime.parse("27::Apr::2014 21::39::48",
                DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss"));
        System.out.println("Default format after parsing = "+dt+"\n");
    }
}
