public class lab2 {
    public static void main(String[] args) {
        // Вхідний масив рядків
        String[] strings = {"Ну", "І", "ВеЛиКі", "ЛІТЕРИ", "я їх ненавиджу"};

        // Сортування масиву за кількістю великих літер у кожному рядку
        bubbleSort(strings);

        // Виведення відсортованого масиву
        for (String str : strings) {
            System.out.println(str);
        }
    }

    // Реалізація сортування бульбашкою
    private static void bubbleSort(String[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (countUppercaseLetters(arr[i - 1]) > countUppercaseLetters(arr[i])) {
                    // Обмін елементів, якщо потрібно
                    String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // Рахування кількості великих літер у рядку
    private static int countUppercaseLetters(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
