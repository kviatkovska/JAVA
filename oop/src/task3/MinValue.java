package task3;

import java.util.Scanner;

public class MinValue {
    public static int min(int a, int b, int c, int d) {
        if (min(a, b) > d && d < c) {
            return d;
        } else if (min(a, b) > c && c < d) {
            return c;
        } else {
            return b;
        }
    }

    public static int min(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}