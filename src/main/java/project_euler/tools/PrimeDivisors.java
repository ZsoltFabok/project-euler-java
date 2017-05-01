package project_euler.tools;


import project_euler.math.prime.PrimeCheck;
import project_euler.math.prime.PrimeFactors;
import project_euler.math.prime.PrimeFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

public class PrimeDivisors {

    public static void main(String... args) {
        printPrimeDivisors(args[0]);
    }

    private static void printPrimeDivisors(String filename) {
        PrimeCheck check = new PrimeCheck(null);
        PrimeFactory factory = new PrimeFactory(check, null);
        PrimeFactors factors = new PrimeFactors(factory);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                Map<Long, Long> f = factors.primeFactors(Long.parseLong(line));
                System.out.println(line + "(" + f.keySet() + ")");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
