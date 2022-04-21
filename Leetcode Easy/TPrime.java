import java.util.*;
import java.util.stream.*;

public class TPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isTPrime(n));
        sc.close();
    }

    static boolean isPrime(int n) {
        if (n <= 2)
            return false;
        else
            return (n % 2) != 0
                    && IntStream.rangeClosed(3, (int) Math.sqrt(n)).filter(a -> a % 2 == 0)
                            .noneMatch(a -> (n % a == 0));
    }

    static boolean isTPrime(int n) {
        int x = (int) Math.sqrt(n);
        if (Math.pow(x, 2) == n)
            if (isPrime(x))
                return true;
        return false;
    }
}
