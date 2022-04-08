import java.util.*;

public class KPrimeSubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int target = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 61; i++)
            nums.add(i);
        nums.set(0, -1);
        nums.set(1, -1);
        ArrayList<Integer> arr = solve1(target, nums, 2, 2);
        for (int i = 0; i < p; i++)
            arr.remove(i);
        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++)
            array[i] = arr.get(i);
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();
        solve(array, target, k, val, ind, array.length);
        sc.close();
    }

    static ArrayList<Integer> solve1(int n, ArrayList<Integer> nums, int i, int j) {
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
                solve1(n, nums, i, j + 1);
            }
            return solve1(n, nums, i + 1, 2);
        }
    }

    static void solve(int num[], int target, int k, ArrayList<Integer> val, ArrayList<Integer> ind, int n) {
        if (target == 0 && val.size() == k)
            System.out.println(val);
        else {
            for (int i = 0; i < n; i++) {
                if (isSafe(val, ind, num[i], i, target)) {
                    val.add(num[i]);
                    ind.add(i);
                    solve(num, target - num[i], k, val, ind, n);
                    val.remove(val.size() - 1);
                    ind.remove(ind.size() - 1);
                }
            }
        }
    }

    static boolean isSafe(ArrayList<Integer> val, ArrayList<Integer> ind, int element, int i, int target) {
        if (element > target)
            return false;
        else if (val.size() == 0)
            return true;
        else if (i <= ind.get(ind.size() - 1))
            return false;
        else if (!ind.contains(i))
            return true;
        return false;
    }
}
