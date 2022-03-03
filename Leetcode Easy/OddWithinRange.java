
//Given a range 'low' and 'high' find the number of odd numbers within this range
import java.util.*;

public class OddWithinRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        sc.close();
        System.out.println(findRange(low, high));
    }

    public static int findRange(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
