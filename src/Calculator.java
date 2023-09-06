import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double num1 = getInputNumber("Введіть перше число: ");
            String operator = getOperator();
            double num2 = getInputNumber("Введіть друге число: ");
            double result = calculate(num1, operator, num2);
            displayResult(result);

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double getInputNumber(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextDouble();
    }

    private static String getOperator() {
        System.out.print("Введіть операцію (+, -, *, /): ");
        return new Scanner(System.in).next();
    }

    private static double calculate(double num1, String operator, double num2) {
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

    private static void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
