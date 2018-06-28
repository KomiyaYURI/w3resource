package main.InputOutputTypesExercises;

import java.io.File;

//Write a Java program to get a list of all file/directory names from the given.
public class InputOutputExercises_1 {
    public static void main(String a[])
    {
        File file = new File("E:\\work\\TW\\week3");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
