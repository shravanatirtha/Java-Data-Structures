
import java.util.*;

public class SieveOfErotosthene {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            nums.add(i);
        nums.set(0, -1);
        nums.set(1, -1);
        System.out.println(solve(n, nums, 2, 2));
    }

    static ArrayList<Integer> solve(int n, ArrayList<Integer> nums, int i, int j) {
        if (Math.pow(i, 2) > n) {
            for (int k = 0; k < nums.size(); k++)
                if (nums.get(k) == -1)
                    nums.remove(k);
            return nums;
        } else {
            if (i * j <= n) {
                int ind = nums.indexOf(i * j);
                if (ind >= 0)
                    nums.set(ind, -1);
                solve(n, nums, i, j + 1);
            }
            return solve(n, nums, i + 1, 2);
        }
    }
}
