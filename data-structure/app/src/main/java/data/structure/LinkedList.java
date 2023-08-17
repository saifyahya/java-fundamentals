package data.structure;

public class LinkedList {
    public Node head;

    public static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertAtStart(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public String toString() {
        String linkedList = "";
        Node current = head;
        while (current != null) {
            linkedList += current.data + "-->";
            current = current.next;
        }
        linkedList += "Null";
        return linkedList;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.data == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}

