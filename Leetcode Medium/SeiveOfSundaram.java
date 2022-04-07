import java.util.*;
public class SeiveOfSundaram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=(n-1)/2;
        //System.out.print(solve(n,1,1 ));
        sc.close();
    }

    static void solve(int n, int i, int j){
        if((i+j+(2*i*j))>n && i==j){
            return ;
        }
        else{
            return; //solve(n, i, j);
        }
    }
}
