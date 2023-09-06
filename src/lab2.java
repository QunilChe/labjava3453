public class lab2 {


    // Реалізація сортування бульбашкою
    public static void bubbleSort(String[] arr) {
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
