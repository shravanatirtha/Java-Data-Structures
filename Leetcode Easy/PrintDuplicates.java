/*
Given a sorted array print the duplicate elements in the array

*/

import java.util.*;

public class PrintDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        printDuplicates(nums, n);
    }

    static void printDuplicates(int[] nums, int n) {
        int x = nums[0];
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] == x) {
                count++;
                x = nums[i];
            } else {
                if (count > 0) {
                    System.out.print(x + " ");
                }
                x = nums[i];
                count = 0;
            }
        }
        if (count > 0) {
            System.out.print(x + " ");
        }
    }
}
