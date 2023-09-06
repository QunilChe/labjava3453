public class lab3 {


    public static boolean validateEmail(final String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        // Заборонені символи у електронних адресах
        String forbiddenChars = " ,:;()<>[]";

        // Перевіряємо, чи є заборонені символи в електронній адресі
        for (char c : forbiddenChars.toCharArray()) {
            if (email.indexOf(c) != -1) {
                return false;
            }
        }

        // Перевіряємо, чи є символ '@' в рядку
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return false;
        }

        // Перевіряємо, чи є символ '.' після символа '@'
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1) {
            return false;
        }

// Перевіряємо, щоб символ '.' не був останнім символом
        if (dotIndex == email.length() - 1) {
            return false;
        }

        return true;


    }
}
