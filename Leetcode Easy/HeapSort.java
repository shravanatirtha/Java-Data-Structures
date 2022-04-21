import java.util.*;
public class HeapSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] list=new int[n];
        sc.close();
        heapsort(list, n);
    }
    static void heapsort(int[] list, int n){
        PriorityQueue<Integer> heap=new PriorityQueue<>();

    }
}

