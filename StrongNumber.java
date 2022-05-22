import java.util.*;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(isStrong(n));
        sc.close();
    }

    static boolean isStrong(int num) {
        int sum = 0;
        int copy = num;
        while (num > 0) {
            int r = num % 10;
            int fact = factorial(r);
            sum += fact;
            num /= 10;
        }
        if (sum == copy)
            return true;
        return false;
    }

    static int factorial(int n) {
        int a = 1;
        int num = 1;
        while (a <= n) {
            num *= a;
            a++;
        }
        return num;
    }
}
