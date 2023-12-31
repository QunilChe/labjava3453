public class lab4 {

    public static final String INVALID_MATRIX_MULTIPLICATION_MESSAGE = "ERRROR";

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        final int rows1 = matrix1.length;
        final int cols1 = matrix1[0].length;
        final int cols2 = matrix2[0].length;

        if (cols1 != matrix2.length) {
            throw new IllegalArgumentException(INVALID_MATRIX_MULTIPLICATION_MESSAGE);
        }

        final int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < cols1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
