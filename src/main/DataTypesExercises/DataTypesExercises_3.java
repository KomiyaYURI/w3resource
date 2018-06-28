package main.DataTypesExercises;

import java.util.Scanner;

public class DataTypesExercises_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int qian = num / 1000;
        int bai = (num - qian * 1000) / 100;
        int shi = (num - qian * 1000 - bai * 100) / 10;
        int ge = (num - qian * 1000 - bai * 100 - shi * 10);
        System.out.println(qian + bai + shi + ge);
    }
}
