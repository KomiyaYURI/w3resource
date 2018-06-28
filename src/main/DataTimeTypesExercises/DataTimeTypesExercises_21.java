package main.DataTimeTypesExercises;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataTimeTypesExercises_21 {
    public static void main(String[] args) {
        //Write a Java program to get the current time in all the available time zones.
        ZoneId.SHORT_IDS.keySet().
                stream().forEach(
                zoneKey ->System.out.println(" "+ ZoneId.of( ZoneId.SHORT_IDS.get( zoneKey ) ) +": "+ LocalDateTime.now(ZoneId.of(ZoneId.SHORT_IDS.get( zoneKey ) ) ) ) );
    }
}
