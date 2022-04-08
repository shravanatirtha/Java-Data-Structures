import java.util.*;

public class KSubsetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++)
            num[i] = sc.nextInt();
        int target = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        ArrayList<Integer> val = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();
        solve(num, target, k, val, ind, n);
    }

    static void solve(int num[], int target, int k, ArrayList<Integer> val, ArrayList<Integer> ind, int n) {
        if (target == 0 && val.size()==k)
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
