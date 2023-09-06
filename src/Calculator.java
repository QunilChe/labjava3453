import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введіть перше число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введіть операцію (+, -, *, /): ");
            String operator = scanner.next();

            System.out.print("Введіть друге число: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        throw new ArithmeticException("Ділення на 0 недопустиме.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Введено невірний знак операції.");
            }

            System.out.println("Результат: " + result);

        } catch (Exception e) {
            System.err.println("Помилка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
