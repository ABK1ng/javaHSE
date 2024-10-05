import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Введите число: ");
            double x = Double.parseDouble(reader.readLine());
            System.out.print("Введите число: ");
            double y = Double.parseDouble(reader.readLine());
            double result = min(x, y);
            System.out.println(result);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    public static double min(double x, double y) {
        double result = x > y? y / 2 : x / 2;
        return result;
    }
}
