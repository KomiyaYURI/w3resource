package main.NumberTypesExercises;

public class NumberTypesExercises_4 {
    public static void main(String[] args) {
      //  Write a Java program to generate and show all Kaprekar numbers less than 1000.
        /**
         * 1       1         0 + 1
         * 9       81        8 + 1
         * 45      2025      20 + 25
         * 55      3025      30 + 25
         * 99      9801      98 + 01
         * 297     88209     88 + 209
         * 703     494209    494 + 209
         * 999     998001    998 + 001
         */

        int ctr = 0;
        int base = (args.length > 0) ? Integer.parseInt(args[0]) : 10;
        for(long n = 1; n <= 1000; n++){
            String sqr_Str = Long.toString(n * n, base);
            for(int j = 0; j < sqr_Str.length() / 2 + 1; j++){
                String[] parts = split_num(sqr_Str, j);
                long first_Num = Long.parseLong(parts[0], base);
                long sec_Num = Long.parseLong(parts[1], base);
                if(sec_Num == 0) break;
                if(first_Num + sec_Num == n){
                    System.out.println(Long.toString(n, base) +
                            "\t" + sqr_Str + "\t  " + parts[0] + " + " + parts[1]);
                    ctr++;
                    break;
                }
            }
        }
        System.out.println(ctr + " Kaprekar numbers.");
    }
    private static String[] split_num(String str, int idx){
        String[] ans1 = new String[2];
        ans1[0] = str.substring(0, idx);
        if(ans1[0].equals("")) ans1[0] = "0";
        ans1[1] = str.substring(idx);
        return ans1;
    }
}
