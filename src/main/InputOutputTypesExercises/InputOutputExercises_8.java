package main.InputOutputTypesExercises;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutputExercises_8 {
    //Write Java program to read input from java console.
    public static void main(String[] args) throws IOException
    {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = R.readLine();
        System.out.println("Your name is: " + name);
    }
}
