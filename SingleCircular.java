public class SingleCircular {
    Node head;
    Node tail;

    public SingleCircular() {
        this.head = null;
        this.tail = null;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertfirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            head = node;
        }
    }
    public void insertlast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }
    public void insertAtIndex(int index, int data) {
        if (index == 0) {
            insertfirst(data);
            return;
        }
        Node node = new Node(data);
        Node temp = head;
        for (int i=0; i<index-1 && temp.next!=head; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
        if (temp == tail) {
            tail = node;
        }
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
    public void delete(int value) {
        Node node = head;
        if (node == null) {
            return;
        }
        if (node.data == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = node.next;
            if (n.data == value) {
                node.next = n.next;
                if (n == tail) {
                    tail = node;
                }
                break;
            }
            node = node.next;
        } while (node != head);
    }

    public static void main(String[] args) {
        SingleCircular circularLL = new SingleCircular();

        circularLL.insertlast(34);
        circularLL.insertlast(12);
        circularLL.insertlast(45);
        circularLL.insertlast(65);
        circularLL.delete(12);
        circularLL.insertlast(4);
        circularLL.insertAtIndex(3,7);

        circularLL.display();
    }
}
