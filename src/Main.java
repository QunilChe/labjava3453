import lab5.DeliveryDepartment;
import lab5.DeparturePoint;
import lab5.ReceivePoint;
import lab5.Shipment;

import java.util.Scanner;

import static java.lang.System.err;

public class Main {
    public static void main(String[] args) {

        {
            Scanner scanner = new Scanner(System.in);

            try {
               // double num1 = lab1.getInputNumber("Введіть перше число: ");
              //  String operator = lab1.getOperator();
                //  double num2 = lab1.getInputNumber("Введіть друге число: ");
                double num1 = 1;
                String operator = "/";
                double num2 = 2;

                double result = lab1.calculate(num1,operator,num2);
                lab1.displayResult(result);

            } catch (Exception e) {
                err.println("Помилка: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
         //task2
        {
            // Вхідний масив рядків
            String[] strings = {"Ну", "І", "ВеЛиКі", "ЛІТЕРИ", "я їх ненавиджу"};

            // Сортування масиву за кількістю великих літер у кожному рядку
            lab2.bubbleSort(strings);

            // Виведення відсортованого масиву
            for (String str : strings) {
                System.out.println(str);
            }
        }
        // tsks3
        {
            String email = "test@example.com"; // Замініть цей рядок на адресу, яку потрібно перевірити
            boolean isValid = lab3.validateEmail(email);

            if (isValid) {
                System.out.println("Електронна адреса валідна.");
            } else {
                System.out.println("Електронна адреса не валідна.");
            }
        }

        //assk4

        {
            // Вхідні матриці (можна ввести свої дані)
            int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
            int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};

            // Виконуємо множення матриць
            int[][] result = lab4.multiplyMatrices(matrix1, matrix2);

            // Виводимо результат
            System.out.println("Результат множення матриць:");
            lab4.printMatrix(result);
        }

        //Task5
        final DeliveryDepartment lviv = new DeliveryDepartment("Lviv", true, true, true);
        final DeliveryDepartment kyiv = new DeliveryDepartment("Kyiv", true, true, true);
        final DeliveryDepartment rivne = new DeliveryDepartment("Rivne", false, false, true);
        final DeliveryDepartment dnipro = new DeliveryDepartment("Dnipro", true, false, false);
        final ReceivePoint[] receivePoints = {new ReceivePoint(kyiv), new ReceivePoint(dnipro)};
        final DeparturePoint[] departurePoints = {new DeparturePoint(lviv), new DeparturePoint(rivne), new DeparturePoint(kyiv)};
        final int MAX_SHIPMENTS = 10;
        boolean isContinue = true;
        Shipment[] shipments = new Shipment[MAX_SHIPMENTS];
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Task 5");

        do {
            System.out.println("Menu:\n1. View all shipments\n2. Add a shipment\n3. Delete a shipment\n0. Exit");
            String choice = scanner.nextLine();
            int countOfShipments = 0;

            for (Shipment ship : shipments) {
                if (ship != null) {
                    countOfShipments++;
                }
            }

            switch (choice) {
                case "1": {
                    if (countOfShipments < 1)
                        System.out.println("No shipments available");

                    for (int i = 0; i < countOfShipments; i++) {
                        System.out.println("Shipment #" + (i + 1));
                        shipments[i].printShipment();
                    }
                    break;
                }
                case "2": {
                    if (countOfShipments >= 10) {
                        System.out.println("Too many shipments in the array");
                        break;
                    }

                    Shipment newShipment = new Shipment(receivePoints, departurePoints, scanner);

                    if (countOfShipments > 0)
                        shipments[countOfShipments - 1] = newShipment;
                    break;
                }
                case "3": {
                    if (countOfShipments < 1) {
                        System.out.println("No shipments available");
                        break;
                    }

                    if (countOfShipments == 1)
                        shipments = new Shipment[MAX_SHIPMENTS];

                    System.out.println("Shipment number to delete?");
                    int choiceOfDelete;

                    try {
                        String shipmentNumber = scanner.nextLine();
                        choiceOfDelete = Integer.parseInt(shipmentNumber);

                        if (choiceOfDelete > countOfShipments || choiceOfDelete < 0)
                            throw new IllegalArgumentException("Invalid input");

                        shipments[choiceOfDelete - 1] = shipments[countOfShipments - 1];
                        countOfShipments--;
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                }
                case "0": {
                    isContinue = false;
                    break;
                }
            }

        } while (isContinue);

        for (int i = 0; i < 5; i++) {
            Shipment shipmentLvivKyiv = new Shipment(receivePoints, departurePoints, scanner);
            shipmentLvivKyiv.printShipment();
            System.out.println("Hello");
        }

        scanner.close();
    }

}
