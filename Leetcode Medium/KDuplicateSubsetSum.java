import java.util.*;

public class KDuplicateSubsetSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int target = sc.nextInt();
        List<String> a = Arrays.asList(s.split("\\s"));
        List<Integer> list = new ArrayList<>();
        for (String i : a)
            list.add(Integer.parseInt(i));
        List<Integer> val = new ArrayList<>();
        List<Integer> ind = new ArrayList<>();
        solve(list, target, val, ind, list.size());
        sc.close();
    }

    static void solve(List<Integer> list, int target, List<Integer> val, List<Integer> ind, int n) {
        if (target == 0)
            System.out.println(val);
        else {
            for (int i = 0; i < n; i++) {
                if (isSafe(list.get(i), target)) {
                    val.add(list.get(i));
                    ind.add(i);
                    solve(list, target - list.get(i), val, ind, n);
                    val.remove(val.size() - 1);
                    ind.remove(ind.size() - 1);
                }
            }
        }
    }

    static boolean isSafe(int element, int target) {
        if (element > target)
            return false;
        return true;
    }
}