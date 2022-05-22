import java.util.*;

public class AlternateReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        if (n % 2 == 0) {
            reverse(nums, 0, n - 2);
            reverse(nums, 1, n - 1);
        } else {
            reverse(nums, 0, n - 1);
            reverse(nums, 1, n - 2);
        }
        sc.close();
        System.out.print(Arrays.toString(nums).replace(",", "").replace("[", "").replace("]", ""));
    }

    static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i += 2;
            j -= 2;
        }
    }
}
