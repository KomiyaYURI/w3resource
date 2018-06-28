package main.DataTimeTypesExercises;

import java.util.Calendar;

public class DataTimeTypesExercises_1 {
    public static void main(String[] args) {
        int year = 2016;
        int month = 0; // January
        int date = 1;

        Calendar cal = Calendar.getInstance();
        //由于Calendar 类是一个抽象类
        // 因此我们不能通过new来获取该对象的实例.
        // 我们可以通过其类方法 getInstance，
        // 以获得此类型的一个通用的对象。
        // Sets the given calendar field value and the time value
        // (millisecond offset from the Epoch) of this Calendar undefined.
        cal.clear();
        System.out.println();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, date);

        System.out.println(cal.getTime());
        System.out.println();
    }
}
