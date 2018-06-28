package main.DataTimeTypesExercises;
//Write a Java program to get seconds since 1970.
public class DataTimeTypesExercises_37 {
    public static void main(String[] args) {
        long seconds = System.currentTimeMillis() / 1000l;
        System.out.println("\nSeconds since 1970: "+seconds+"\n");
    }
}
