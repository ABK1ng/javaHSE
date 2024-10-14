import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = 0;
        int column = 0;
        int numRow = 0;
        int count = 0;

        try {
            System.out.print("Введите количество строчек: ");
            rows = Integer.parseInt(reader.readLine());
            System.out.print("Введите количество столбцов: ");
            column = Integer.parseInt(reader.readLine());

            do {
                System.out.print("Введите номер строки: ");
                numRow = Integer.parseInt(reader.readLine());
            } while (!(numRow > 0 && numRow <= rows));
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }

        int[][] matrix = createMatrix(rows, column);

        System.out.println("Матрица: ");
        for (int[] arr: matrix) {
            for (int i: arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        count = positiveNumber(matrix, numRow, column);

        System.out.print("Положительных чисел в " + numRow + " строке: " + count);


    }

    public static int[][] createMatrix(int row, int column) {
        int[][] matrix = new int[row][column];
        Random rnd = new Random();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = rnd.nextInt(1000);
            }
        }

        return matrix;
    }

    public static int positiveNumber(int[][] matrix, int  rowNum, int column) {
        int count = 0;
        for (int i = 0; i < column; i++) {
            if (matrix[rowNum - 1][i] % 2 == 0) count++;
        }

        return count;
    }
}
