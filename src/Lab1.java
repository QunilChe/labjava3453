import java.util.Scanner;

public class Lab1 {

    public static final String OPERATOR_MESSAGE = " (+, -, *, /): ";

    public static double getInputNumber(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextDouble();
    }

    public static String getOperator() {
        System.out.print(OPERATOR_MESSAGE);
        return new Scanner(System.in).next();
    }

    public static double calculate(double num1, String operator, double num2) {
        final String ADDITION = "+";
        final String SUBTRACTION = "-";
        final String MULTIPLICATION = "*";
        final String DIVISION = "/";

        switch (operator) {
            case ADDITION:
                return num1 + num2;
            case SUBTRACTION:
                return num1 - num2;
            case MULTIPLICATION:
                return num1 * num2;
            case DIVISION:
                if (num2 == 0) {
                    throw new ArithmeticException("Dividing by zero error.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Illegal operation.");
        }
    }

    public static void displayResult(double result) {
        System.out.println("Result: " + result);
    }

}
