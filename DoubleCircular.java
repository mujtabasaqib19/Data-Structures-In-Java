public class DoubleCircular {
    Node head;
    Node tail;
    public DoubleCircular() {
        this.head = null;
        this.tail = null;
    }
    class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            head.prev = tail;
            tail.next = head;
        }
    }

    public void insertLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            node.prev = tail;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            tail.next = head;
            head.prev = tail;
        }
    }

    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertFirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node;
        temp.next = node;
        if (temp == tail) {
            tail = node;
        }
    }

    public void delete(int value) {
        if (head == null) {
            return;
        }
        if (head.data == value && head == tail) {
            head = null;
            tail = null;
            return;
        }
        if (head.data == value) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
            return;
        }
        Node temp = head;
        do {
            if (temp.data == value) {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                if (temp == tail) {
                    tail = temp.prev;
                }
                break;
            }
            temp = temp.next;
        } while (temp != head);
    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.data + " -> ");
                node = node.next;
            } while (node != head);
        }
        System.out.println("End");
    }

    public static void main(String[] args) {
        DoubleCircular circularLL = new DoubleCircular();

        circularLL.insertLast(34);
        circularLL.insertLast(12);
        circularLL.insertLast(45);
        circularLL.insertLast(65);
        circularLL.delete(12);

        circularLL.display();
    }
}
