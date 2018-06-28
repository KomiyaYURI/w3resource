package main.NumberTypesExercises;

public class NumberTypesExercises_8 {
    /**
     * Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle. Go to the editor
     * In combinatorial mathematics, the Catalan numbers form a sequence of natural numbers that occur in various counting problems, often involving recursively-defined objects. They are named after the Belgian mathematician Eugène Charles Catalan.
     * The first Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190, 6564120420, 24466267020, 91482563640, 343059613650, 1289904147324, 4861946401452,
     * List 10 Catalan numbers:-
     * 1
     * 2
     * 5
     * 14
     * 42
     * 132
     * 429
     * 1430
     * 4862
     * 16796
     */
    public static void main(String[] args) {
        int num = 10;
        int[] t = new int[num + 2];
        t[1] = 1;
        System.out.printf("\nList 10 Catalan numbers:-\n");
        for (int i = 1; i <= num; i++) {

            for (int j = i; j > 1; j--)
                t[j] = t[j] + t[j - 1];

            t[i + 1] = t[i];

            for (int j = i + 1; j > 1; j--)
                t[j] = t[j] + t[j - 1];
            System.out.printf("\n%d ", t[i + 1] - t[i]);
        }
        System.out.printf("\n");
    }
}
