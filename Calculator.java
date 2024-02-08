import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // scanner obj to get user input
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome...this is a calculator");

        // prompt user to enter the first number
        System.out.println("enter the first number: ");
        // store the number
        double num1 = scanner.nextDouble();

        // second number
        System.out.println("enter a second number: ");
        double num2 = scanner.nextDouble();

        // prompt user to choose an operation
        System.out.println("choose an operation:(+, -, *, /) ");

        // store that too
        char operator = scanner.next().charAt(0);

        // now use a switch statement to carry out the operations
        double result = 0;

        switch (operator) {
            case '+':
                result = add(num1, num2);

                break;
            case '-':
                result = subtract(num1, num2);

                break;
            case '*':
                result = multiply(num1, num2);

                break;
            case '/':
                result = divide(num1, num2);

                break;

            default:
                System.out.println("invalid operation!");
                return;
        }
        System.out.println("Result: " + result);

    }
    // define the methods for the maths

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        // u cannot divide by o
        if (b == 0) {
            System.err.println("error: division by zero");
            return Double.NaN;
        } else if (a == 0) {
            System.out.println("error: division by zero");
            return Double.NaN;
        }
        return a / b;
    }
}
