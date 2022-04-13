import java.util.*;

public class NumberPermutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> a = Arrays.asList(s.split("\\s"));
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.size(); i++)
            list.add(Integer.parseInt(a.get(i)));
        List<Integer> val = new ArrayList<>();
        ArrayList<Integer> ind = new ArrayList<>();
        solve(list, list.size(), val, ind, 0);
        sc.close();
    }

    static void solve(List<Integer> s, int n, List<Integer> val, List<Integer> ind, int ch) {
        if (ch == n)
            System.out.println(val);
        else {
            for (int i = 0; i < n; i++) {
                if (isSafe(ind, i)) {
                    val.add(s.get(i));
                    ind.add(i);
                    solve(s, n, val, ind, ch + 1);
                    val.remove(val.size() - 1);
                    ind.remove(ind.size() - 1);
                }
            }
        }
    }

    static boolean isSafe(List<Integer> ind, int i) {
        if (!ind.contains(i))
            return true;
        return false;
    }
}