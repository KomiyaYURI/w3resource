package main.NumberTypesExercises;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberTypesExercises_5 {

    /**
     * Write a Java program to find the number of seed Lychrel number candidates and related numbers for n in the range 1..10000 inclusive. (With that iteration limit of 500). Go to the editor
     * A Lychrel number is a natural number that cannot form a palindrome through the iterative process of repeatedly reversing its digits and adding the resulting numbers. This process is sometimes called the 196-algorithm, after the most famous number associated with the process.
     * The first few Lychrel numbers are 196, 295, 394, 493, 592, 689, 691, 788, 790, 879, 887, ... .
     * Expected Output :
     * 5 Lychrel seeds: [196, 879, 1997, 7059, 9999]
     * 244 Lychrel related
     * 5 Lychrel palindromes: [196, 879, 1997, 7059, 9999]
     */


    static Map<BigInteger, Tuple> cache = new HashMap<>();
    static class Tuple {
        final Boolean flag;
        final BigInteger bi;

        Tuple(boolean f, BigInteger b) {
            flag = f;
            bi = b;
        }
    }
    static BigInteger rev(BigInteger bi) {
        String s = new StringBuilder(bi.toString()).reverse().toString();
        return new BigInteger(s);
    }
    static Tuple lychrel(BigInteger n) {
        Tuple res;
        if ((res = cache.get(n)) != null)
            return res;

        BigInteger r = rev(n);
        res = new Tuple(true, n);
        List<BigInteger> seen = new ArrayList<>();
        for (int i = 0; i < 500; i++) {
            n = n.add(r);
            r = rev(n);

            if (n.equals(r)) {
                res = new Tuple(false, BigInteger.ZERO);
                break;
            }
            if (cache.containsKey(n)) {
                res = cache.get(n);
                break;
            }
            seen.add(n);
        }
        for (BigInteger bi : seen)
            cache.put(bi, res);
        return res;
    }
    public static void main(String[] args) {
        List<BigInteger> seeds = new ArrayList<>();
        List<BigInteger> related = new ArrayList<>();
        List<BigInteger> palin = new ArrayList<>();

        for (int i = 1; i <= 10_000; i++) {
            BigInteger n = BigInteger.valueOf(i);
            Tuple t = lychrel(n);
            if (!t.flag)
                continue;
            if (n.equals(t.bi))
                seeds.add(t.bi);
            else
                related.add(t.bi);

            if (n.equals(t.bi))
                palin.add(t.bi);
        }
        System.out.printf("%d Lychrel seeds: %s%n", seeds.size(), seeds);
        System.out.printf("%d Lychrel related%n", related.size());
        System.out.printf("%d Lychrel palindromes: %s%n", palin.size(), palin);
    }
}
