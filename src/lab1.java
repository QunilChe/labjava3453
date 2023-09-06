import java.util.Scanner;

import static java.lang.System.err;

public class lab1 {

    public static double getInputNumber(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextDouble();
    }

    public static String getOperator() {
        System.out.print("Введіть операцію (+, -, *, /): ");
        return new Scanner(System.in).next();
    }

    public static double calculate(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new ArithmeticException("Ділення на 0 недопустиме.");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("Введено невірний знак операції.");
        }
    }

    public static void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
