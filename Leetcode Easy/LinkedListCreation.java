import java.util.*;

public class LinkedListCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List list=new List();
        String a = sc.nextLine();
        System.out.println(list.addData(a));
        String b = sc.nextLine();
        System.out.println(list.addData(b));
        sc.close();
    }
}

class Node {
    private String data;
    private Node next;

    Node(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

class List {
    private Node head;
    private Node tail;

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public Node addData(String data) {
        Node node = new Node(data);
        if (this.head == null)
            this.head = this.tail = null;
        else {
            this.tail.setNext(node);
            this.tail = node;
        }
        return node;
    }
}
