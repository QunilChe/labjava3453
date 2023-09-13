public class lab3 {

    public static boolean validateEmail(final String email) {
        // exceptions message
        StringBuilder errorMessages = new StringBuilder();

        if (email == null || email.isEmpty()) {
            errorMessages.append("null.\n");
        }

        //
        final String forbiddenChars = " ,:;()<>[]";

        // check
        for (char c : forbiddenChars.toCharArray()) {
            if (email.indexOf(c) != -1) {
                errorMessages.append("there are forbiden symbols: ").append(c).append("\n");
            }
        }

        // Перевіряємо, чи є символ '@' в рядку
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            errorMessages.append("need '@'.\n");
        }

        // Перевіряємо, чи є символ '.' після символа '@'
        int dotIndex = email.indexOf('.', atIndex);
        if (dotIndex == -1) {
            errorMessages.append("need '.' after '@'.\n");
        }

        // Перевіряємо, щоб символ '.' не був останнім символом
        if (dotIndex == email.length() - 1) {
            errorMessages.append("symbol '.' is forbiden on the end.\n");
        }

        // Виводимо повідомлення про помилки (якщо є)
        if (errorMessages.length() > 0) {
            System.out.println("exception:");
            System.out.println(errorMessages.toString());
            return false;
        }

        return true;
    }
}
