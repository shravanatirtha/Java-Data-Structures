import java.util.*;
/*
input: integer n followed by n lines of whole input 
5 
7894
65479
12
30
99
output: 
997894654793012

*/
public class LargestArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();// the next line after int and before string is taken to be an empty string. so
                             // we use an extra line to take it as an input
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextLine());

        Collections.sort(list, new Comparator<String>() { // comparator object for sorting objects i.e String is a
                                                          // object
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        });
        Iterator<String> i = list.iterator(); // Iterator class for looping over Collections
        while (i.hasNext())
            System.out.print(i.next());
        sc.close();
    }
}
