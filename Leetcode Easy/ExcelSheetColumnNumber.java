//given title of a excel sheet column, print the column number
import java.util.*;
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String colTitle=sc.nextLine();
        sc.close();
        System.out.println(generateNumber(colTitle));
    }
    public static int generateNumber(String title) {
        if(title==null) return -1;
        int sum=0;
        for(char c: title.toUpperCase().toCharArray()){
            sum*=26;
            sum+=c-'A'+1;
        }
        return sum;
    }
}
