package main.DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_6 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Input high and weifht");
        int high = input.nextInt();
        int weight = input.nextInt();


        double BMI = weight * 0.45359237 / (high * 0.0254 * high * 0.0254);
        System.out.print("Body Mass Index is " + BMI+"\n");

    }
}
