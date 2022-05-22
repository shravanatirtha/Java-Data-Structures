import java.util.*;

public class PalindromicDeletions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            String s = sc.nextLine();
            for (int i = 1; i < n; i++) {
                System.out.println(isPalindrome(s, i, n - 1));
            }

            T--;
        }
        sc.close();
    }

    static boolean isPalindrome(String s, int start, int end) {
        int n = s.length();
        if (n == 1 || n == 0)
            return true;
        if (start != end)
            return false;
        if (start < end + 1)
            return isPalindrome(s.substring(start + 1, end - 1), start + 1, end - 1);
        return true;
    }
    static void generatePermutation(String s, int n, ArrayList<Character> val, ArrayList<Integer> ind, int ch) {
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