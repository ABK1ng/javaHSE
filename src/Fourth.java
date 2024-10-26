import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fourth {
    public static void main(String[] args) {
        int rows = 0;
        int column = 0;
        int numRow = 0;
        List <Integer> positiveNumber;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Введите количество строчек: ");
            rows = Integer.parseInt(reader.readLine());
            System.out.print("Введите количество столбцов: ");
            column = Integer.parseInt(reader.readLine());
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

        positiveNumber = positiveNumber(matrix, numRow, column);
        System.out.print("Положительные числа в матрице" + '\n');
        for (int i = 0; i < positiveNumber.size(); i++) {
            System.out.println("В " + (i + 1) + " строке: " + positiveNumber.get(i));
        }
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

    public static List <Integer> positiveNumber(int[][] matrix, int  rowNum, int column) {
        List <Integer> list = new ArrayList<>();
        int count = 0;
        for (int[] arr: matrix) {
            for (int i: arr) {
                if (i % 2 == 0) count++;
            }
            list.add(count);
            count = 0;
        }
        return list;
    }
}
