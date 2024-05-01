import java.util.Arrays;

public class MainTest {

    public static void main(String[] args) {
        int[][] matrix1 = {
                {5, 6, 2},
                {5, 3, 4},
                {9, 1, 9}
        };

        int[][] matrix2 = {
                {2, 3, 7},
                {7, 1, 2},
                {9, 2, 8}
        };

        int[][] result = Main.sumMatrices(matrix1, matrix2);

        System.out.println("Результат додавання двох матриць:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
