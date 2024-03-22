import java.util.Scanner;


    public class PALoops {
        public static void main(String[] args) {

            // 1: Print a Multiplication Table
            int val1, val2;
            System.out.printf("    ");
            for (val1 = 1; val1 < 13; val1++)
                System.out.printf("%4d", val1);
            System.out.println();
            for (val1 = 1; val1 < 13; val1++) {
                System.out.printf("%4d", val1);
                for (val2 = 1; val2 < 13; val2++)
                    System.out.printf("%4d", val1 * val2);
                System.out.println();
            }

            System.out.println();
            System.out.println();

            // 2: Find the Greatest Common Divisor
            int n1, n2, k, gcd = 1;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first positive integer: ");
            n1 = sc.nextInt();
            System.out.print("Enter second positive integer: ");
            n2 = sc.nextInt();
            for (k = 2; k < n1 || k < n2; k++)
                if (n1 % k == 0 && n2 % k == 0)
                    gcd = k;
            System.out.println("The GCD of " + n1 + " and " + n2 + " is " + gcd + ".");

            System.out.println();
            System.out.println();

            // 3: Predict Future Tuition
            double tuition, nextTution;
            int year = 0;
            System.out.print("Enter your tuition for the current year: $");
            tuition = sc.nextDouble();
            nextTution = tuition;
            System.out.println("Tuition year");
            while (nextTution < tuition * 2) {
                System.out.printf("%3d", year);
                System.out.printf("%11.2f\n", nextTution);
                nextTution = 1.07 * nextTution;
                year++;
            }
            System.out.printf("%3d", year);
            System.out.printf("%11.2f\n\n", nextTution);
            System.out.println("The current tuition $" + tuition + " will be doubled in " + year + " years.");
            // close main
        }
        // close class
    }

