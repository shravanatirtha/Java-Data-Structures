import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++)
            list[i] = sc.nextInt();
        sc.close();
        Heap h = new Heap();
        h.heapsort(list, n);

    }

}

class Heap {
    void heapsort(int[] list, int n) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            heap.add(list[i]);
        }
        System.out.print(heap.toString().replace(",", "").replace("[", "").replace("]", ""));

    }
}
