import java.util.Arrays;
/*
 * Клас, що містить метод для обчислення двух матриць.
 */
public class Main {

    /*
     * Метод, для обчислення матриць
     * @param matrix1 Перша матриця.
     * @param matrix2 Друга матриця.
     * @return Результат обчислень суми матриць.
     * @throws IllegalArgumentException Якщо матриці мають різний розмір.
     */
    public static int[][] sumMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            throw new IllegalArgumentException("Матриці мають різний розмір");
        }

        // Отримання кількості рядків і стовпців.
        int rows = matrix1.length;
        int cols = matrix2[0].length;

        //Створення нової мтариці для збереження результату.
        int[][] result = Arrays.copyOf(matrix1, matrix2.length);

        // Використання метооду Arrays.setAll для обчислення суми елементів матриці.
        for (int i = 0; i < rows; i++) {
            final int rowIndex = i;
            Arrays.setAll(result[i], j -> matrix1[rowIndex][j] + matrix2[rowIndex][j]);
        }
        return result;
    }
}
