import java.util.*;

public class LargestArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(sc.nextLine());

        Collections.sort(list, new Comparator<String>() {
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        });
        Iterator<String> i = list.iterator();
        while (i.hasNext())
            System.out.print(i.next());
        sc.close();
    }
}
