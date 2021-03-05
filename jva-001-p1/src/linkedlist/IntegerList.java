package linkedlist;

import java.util.LinkedList;

public class IntegerList {

    private final Node root;

    public IntegerList() {
        root = new Node(-1);
    }

    public void add(Integer value) {
        Node currentNode = root;
        Node newNode = new Node(value);
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void print() {
        Node currentNode = root;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.value);
        }
    }

     static class Node {
        private Integer value;
        private Node next;

        public Node(Integer value) {
            this.value = value;
        }

        public static void test(){
            System.out.println("test");
        }
    }
}
