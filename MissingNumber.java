import java.util.*;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();
        sc.close();
        System.out.print(missing(nums,n));
    }

    static int missing(int[] nums,int n) {
        int sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(max<nums[i])
            max=nums[i];
            if(min>nums[i])
            min=nums[i];
            sum+=nums[i];
        }
        int sn=((n+1)/2)*(min+max);
        return sn-sum;
    }
}
