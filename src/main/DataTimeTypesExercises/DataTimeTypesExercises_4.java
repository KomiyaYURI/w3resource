package main.DataTimeTypesExercises;

import java.util.Calendar;

public class DataTimeTypesExercises_4 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int minyear = cal.getActualMinimum(Calendar.YEAR);
        int minmonth = cal.getActualMinimum(Calendar.MONTH);
        int minweek = cal.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int mindate = cal.getActualMinimum(Calendar.DATE);

        System.out.println("Actual Minimum Year: "+minyear);
        System.out.println("Actual Minimum Month: "+minmonth);
        System.out.println("Actual Minimum Week of Year: "+minweek);
        System.out.println("Actual Minimum Date: "+mindate+"\n");
        System.out.println();

    }
}
