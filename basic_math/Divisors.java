package basic_math;

import java.util.ArrayList;

public class Divisors {
    public static void main(String[] args) {
        DivisorsList(12); // Change this to any number you'd like to test.
    }

    public static void DivisorsList(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        ArrayList<Integer> divisors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);
            }
        }

        System.out.println("Divisors of " + n + ": " + divisors);
    }
}
