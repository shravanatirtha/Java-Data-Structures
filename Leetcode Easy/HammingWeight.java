
/* Write a function that takes an unsigned integer and returns the number of '1' bits 
*  it is (also known as the Hamming weight).
*/
import java.util.*;

public class HammingWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); // 00000000000000000000000000001011
        sc.close();
        int sum=0;
        int p=0;
        for(int i=s.length()-1;i>=0;i--){
            sum=sum+((s.charAt(i)-'0')*(int)Math.pow(2,p)); // decimal conversion
            p++;
        }
        // sum = 11
        System.out.println(hammingWeight(sum));
    }

    public static int hammingWeight(int n) { // treat 'n' as unsigned integer
        int count = 0;
        for (int i = 0; i < 32; i++) {
            count = count + (n & 1);
            n = n >> 1;
        }
        return count; // 3
    }
}
