//given a column number print the column title
import java.util.*;
public class ExcelSheetColumnTitle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int colNum=sc.nextInt();
        sc.close();
        System.out.println(generateTitle(colNum));
    }
    public static String generateTitle(int num){
        return num<1 ? "":generateTitle((num-1)/26)+(char)((num-1)%26+'A');
    }
}
