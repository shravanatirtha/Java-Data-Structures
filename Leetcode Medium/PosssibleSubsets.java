import java.util.*;

public class PosssibleSubsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> a = Arrays.asList(s.split("\\s"));
        List<Integer> list = new ArrayList<>();
        for (String i : a)
            list.add(Integer.parseInt(i));
        //Collections.sort(list);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> val = new ArrayList<>();
        solve(list, 0, val, result);
        System.out.print(result);
        sc.close();
    }

    static void solve(List<Integer> list, int i, List<Integer> val, List<List<Integer>> result) {
        if (i == list.size()) {
            result.add(new ArrayList<>(val));
            return;
        }
        val.add(list.get(i));
        solve(list, i + 1, val, result);
        val.remove(val.size() - 1);
        solve(list, i + 1, val, result);
    }
}