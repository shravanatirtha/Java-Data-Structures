import java.util.*;

public class StringPermutation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<Character> val=new ArrayList<>();
        ArrayList<Integer> ind=new ArrayList<>();
        solve(s,s.length(), val, ind, 0);
        sc.close();
    }

    static void solve(String s, int n, ArrayList<Character> val, ArrayList<Integer> ind, int ch) {
        if (ch == n)
            System.out.println(val);
        else {
            for (int i = 0; i < n; i++) {
                if (isSafe(ind, i)) {
                    val.add(s.charAt(i));
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
