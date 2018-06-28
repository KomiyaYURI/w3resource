package main.NumberTypesExercises;

/**
 *  Write a Java program to display first 10 lucus numbers. Go to the editor
 * The Lucas numbers or series are an integer sequence named after the mathematician François Édouard Anatole Lucas, who studied both that sequence and the closely related Fibonacci numbers. Lucas numbers and Fibonacci numbers form complementary instances of Lucas sequences.
 * The sequence of Lucas numbers is: 2, 1, 3, 4, 7, 11, 18, 29, ….
 * Expected Output :
 *
 *    First ten Lucas a numbers:
 * 2
 * 1
 * 3
 * 4
 * 7
 * 11
 * 18
 * 29
 * 47
 * 76
 */
public class NumberTypesExercises_7 {

    public static void main(String[] args) {

        System.out.print("\nFirst ten Lucas a numbers: ");
        int n = 10;
        int n1 = 2, n2 = 1, n3;
        if (n > 1){
            System.out.println("\n2\n1");
            for(int i = 2; i < n; ++i){
                n3 = n2;
                n2 += n1;
                n1 = n3;
                System.out.println(n2);
            }
        }
        else if (n == 1)
            System.out.println("\n2");

        else
            System.out.println("Input a positive number.");
    }
}
