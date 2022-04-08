import java.util.*;

public class PowerNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(solve(n, m));
        sc.close();
    }

    static int solve(int n,int m) {
        if(m==1 || m==0) return 1;
        else{
            return n*solve(n,m-1);
        }
    }
}
