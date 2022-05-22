import java.util.*;

public class SeiveOfSundaram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n = (n - 1) / 2;
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            nums.add(i);
        System.out.println(solve(n, 1, 1, nums));
        sc.close();
    }

    static ArrayList<Integer> solve(int n, int i, int j, ArrayList<Integer> nums) {
        if (((i + j + (2 * i * j)) > n) && (i == j)) {
            j = 2;
            // System.out.println(nums);
            for (i = 0; i < nums.size(); i++)
                nums.set(i, nums.get(i) * j + 1);
            return nums;
        } else if ((i + j + (2 * i * j)) <= n) {
            int ind = nums.indexOf(i + j + (2 * i * j));
            if (ind >= 0)
                nums.remove(ind);
            solve(n, i, j + 1, nums);
        } else if ((i + j + (2 * i * j)) > n) {
            solve(n, i + 1, i + 1, nums);
        }
        return nums;
    }
}
