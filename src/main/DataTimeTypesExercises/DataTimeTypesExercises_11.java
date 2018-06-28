package main.DataTimeTypesExercises;

import java.util.Calendar;

public class DataTimeTypesExercises_11 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int days = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

        System.out.println("Number of days of the current month : " + days);

    }
}
