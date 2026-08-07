import java.util.Scanner;

public class Fibonacci {

    // Recursive Method
    static int recursiveFib(int n) {
        if (n <= 1)
            return n;

        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    // Non-Recursive Method
    static void nonRecursiveSeries(int n) {

        int a = 0, b = 1, c;

        System.out.print("Non-Recursive Series: ");

        if (n >= 0)
            System.out.print(a + " ");

        if (n >= 1)
            System.out.print(b + " ");

        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    // Recursive Series
    static void recursiveSeries(int n) {

        System.out.print("Recursive Series: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(recursiveFib(i) + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        recursiveSeries(n);
        System.out.println();

        nonRecursiveSeries(n);

        sc.close();
    }
}