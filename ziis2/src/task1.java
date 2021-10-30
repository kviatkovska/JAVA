import java.util.Scanner;

public class task1 {
    static int gcd(int a, int b)    {
        if (a == 0 || b == 0)
            return 0;

        if (a == b)
            return a;

        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
    static int phi(int n) {
        int count=0;
        for(int i = 1; i < n; ++i) {
            if(gcd(n, i) == 1) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть число: ");
        int n = in.nextInt();
        System.out.printf("функція Ейлера(%d): %d\n", n, phi(n));
    }
}
