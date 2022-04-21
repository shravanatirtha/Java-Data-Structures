import java.util.*;

public class GoodPermutation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test = 1; test <= T; test++) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int c = 1;
            for (int i = 0; i < n; i++) {
                list.add(c);
                c++;
            }
            ArrayList<Integer> val = new ArrayList<>();
            ArrayList<Integer> ind = new ArrayList<>();
            solve(list, list.size(), val, ind, 0);
        }
        sc.close();
    }

    static void solve(ArrayList<Integer> s, int n, ArrayList<Integer> val, ArrayList<Integer> ind, int ch) {
        if (ch == n) {
            int counter = 1;
            if (counter != val.get(0)) {
                int result = Math.abs(val.get(0) - counter);
                counter = 2;
                for (int i = 1; i < val.size(); i++) {
                    if (counter != val.get(i)) {
                        result = result ^ Math.abs(val.get(i) - counter);
                        counter++;
                    }
                }
                if (result == 0) {
                    System.out.println(val.toString().replace("[", "").replace("]", " ").replace(",", ""));
                    return;
                }
                
            }
            //else System.out.println("-1");
        } 
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

    static boolean isSafe(ArrayList<Integer> ind, int i) {
        if (!ind.contains(i))
            return true;
        return false;
    }
}