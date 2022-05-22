import java.util.*;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        sc.close();
        int result[] = mergeArray(a, n, b, m);
        for (int i = 0; i < m + n; i++)
            System.out.print(result[i] + " ");
    }

    static int[] mergeArray(int[] a, int n, int[] b, int m) {
        int result[] = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] > b[j]) {
                result[k] = b[j];
                k++;
                j++;
            } else {
                result[k] = a[i];
                i++;
                k++;
            }
        }
        while (i < n) {
            result[k] = a[i];
            i++;
            k++;
        }
        while (j < m) {
            result[k] = b[j];
            j++;
            k++;
        }
        return result;
    }
}
