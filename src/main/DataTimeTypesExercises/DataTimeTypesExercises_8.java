package main.DataTimeTypesExercises;

import java.util.Calendar;

public class DataTimeTypesExercises_8 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //  cal.setTime(date);


        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println(cal.getTime());

    }
}
