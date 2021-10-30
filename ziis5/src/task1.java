import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

        public static int gcd_3(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введіть перше число: ");
            int a = Integer.parseInt(reader.readLine());
            System.out.println("Введіть друге число: ");
            int b = Integer.parseInt(reader.readLine());
            System.out.println("Найбільший спільний дільник: "  + gcd_3(a, b));

        }

    }
