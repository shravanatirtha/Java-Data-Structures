import java.util.*;

public class Josephus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.print(jo(n, k));
        sc.close();
    }

    static int jo(int n, int k) {
        if (n == 1)
            return 1;
        return (jo(n - 1, k) + k - 1) % n + 1;
    }
}
