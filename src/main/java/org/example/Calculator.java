package org.example;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculator
{
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        if (x == 0 || x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }
    public static double naturalLogarithm(double x) {
        return Math.log(x);
    }

    public static double powerFunction(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator Menu:");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Logarithm (ln(x))");
            System.out.println("4. Power Function (xb)");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            try {
                double result;
                switch (choice) {
                    case 1:
                        System.out.print("Enter the number for square root (√x): ");
                        double numSquareRoot = scanner.nextDouble();
                        result = squareRoot(numSquareRoot);
                        break;
                    case 2:
                        System.out.print("Enter the number for factorial (x!): ");
                        int numFactorial = scanner.nextInt();
                        result = factorial(numFactorial);
                        break;
                    case 3:
                        System.out.print("Enter the number for natural logarithm (ln(x)): ");
                        double numLog = scanner.nextDouble();
                        result = naturalLogarithm(numLog);
                        break;
                    case 4:
                        System.out.print("Enter the base for the power function (xb): ");
                        double base = scanner.nextDouble();
                        System.out.print("Enter the exponent for the power function (xb): ");
                        double exponent = scanner.nextDouble();
                        result = powerFunction(base, exponent);
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                        continue;
                }
                System.out.println("Result: " + result);

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        scanner.close();

    }
}
