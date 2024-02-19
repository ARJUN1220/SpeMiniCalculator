package com.example.project_mini_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ProjectMiniCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectMiniCalculatorApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("******************************");
            System.out.println("**      mini Calculator     **");
            System.out.println("******************************");
            System.out.println("1. Square root function - √x");
            System.out.println("2. Factorial function - x!");
            System.out.println("3. Natural logarithm (base е) - ln(x)");
            System.out.println("4. Power function - x^b");
            System.out.println("5. Exit");
            System.out.println("******************************");
            System.out.println("");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a number for square root: ");
                    double sqrtInput = scanner.nextDouble();
                    System.out.println("Square root: " + squareRoot(sqrtInput));
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter a number for factorial: ");
                    int factorialInput = scanner.nextInt();
                    System.out.println("Factorial: " + factorial(factorialInput));
                    System.out.println("");
                    break;
                case 3:
                    System.out.print("Enter a number for natural logarithm: ");
                    double lnInput = scanner.nextDouble();
                    System.out.println("Natural logarithm: " + naturalLogarithm(lnInput));
                    System.out.println("");
                    break;
                case 4:
                    System.out.print("Enter the base (x) for the power function: ");
                    double powerBase = scanner.nextDouble();
                    System.out.print("Enter the exponent (b) for the power function: ");
                    double powerExponent = scanner.nextDouble();
                    System.out.println("Power function: " + powerFunction(powerBase, powerExponent));
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Exiting the calculator");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    System.out.println("");
            }
        }
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static long factorial(int x) {
        long result = 1;

        for (int i = 2; i <= x; i++) {
            result *= i;
        }

        return result;
    }

    public static double naturalLogarithm(double x) {
        return Math.log(x);
    }

    public static double powerFunction(double x, double b) {
        return Math.pow(x, b);
    }

}