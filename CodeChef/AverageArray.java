import java.util.*;

public class AverageArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 1; test <= T; test++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int num[] = new int[n + x];
            int count = 1;
            for (int i = 0; i < n + x; i++) {
                num[i] = count;
                count++;
            }
            int target = n * x;
            int k = n;
            ArrayList<Integer> val = new ArrayList<>();
            ArrayList<Integer> ind = new ArrayList<>();
            solve(num, target, k, val, ind, n + x, x);
        }
        sc.close();
    }

    static void solve(int num[], int target, int k, ArrayList<Integer> val, ArrayList<Integer> ind, int n, int t) {
        if (target == 0 && val.size() == k) {
            int sum = 0;
            for (int i = 0; i < k; i++) {
                if(val.get(i)>=k && val.get(i)<=n)
                sum += val.get(i);
            }

            if (sum / k == t)
                System.out.println(val.toString().replace("[", "").replace("]", " ").replace(",", ""));
        } else {
            for (int i = 0; i < n; i++) {
                if (isSafe(val, ind, num[i], i, target)) {
                    val.add(num[i]);
                    ind.add(i);
                    solve(num, target - num[i], k, val, ind, n, t);
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
