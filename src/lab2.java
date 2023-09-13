public class lab2 {

    // buble sort
    public static void bubbleSort(final String[] arr) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < arr.length; i++) {
                if (countUppercaseLetters(arr[i - 1]) > countUppercaseLetters(arr[i])) {
                    // Обмін елементів, якщо потрібно
                    final String temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
    }

    // how much big symbols
    private static int countUppercaseLetters(final String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
