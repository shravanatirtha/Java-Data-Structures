import java.util.*;
import java.util.regex.Pattern;

public class NewPassword {
    static Pattern len = Pattern.compile(".{7}");
    static Pattern lower = Pattern.compile("(?=.*[a-z])");
    static Pattern upper = Pattern.compile("(?=.*[A-Z])");
    static Pattern number = Pattern.compile("(?=.*[0-9])");
    static Pattern special = Pattern.compile("(?=.*[#@*&])");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            if (n < 7) {
                System.out.println("length");
            }
            if (lower.matcher(s).matches()==false) {
                System.out.println("lower");
            }
            if (upper.matcher(s).matches()==false) {
                System.out.println("upper");
            }
            if (number.matcher(s).matches()==false) {
                System.out.println("digit");
            }
            if (special.matcher(s).matches()==false) {
                System.out.println("special");
            }
            T--;
        }
        sc.close();
    }
}
