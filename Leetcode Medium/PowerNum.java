import java.util.*;

public class PowerNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solve1(n, m));
        System.out.println(solve2(n, m));
        sc.close();
    }

    // regular method
    static int solve1(int n, int m) {
        if (m == 0)
            return 1; // base cases
        if (m == 1)
            return n;
        else
            return n * solve1(n, m - 1);// recursive case

    }

    // decomposition
    static int solve2(int n, int m) {
        if (m == 0)
            return 1; // base cases
        if (m == 1)
            return n;
        if (m % 2 == 0)
            return solve2(n, m / 2) * n;
        else
            return solve2(n * n, m / 2) * n;
    }
}
