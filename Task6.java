public class Task6 {
    private int size;
    Node head;

    public Task6() {
        this.size = 0;
    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("END");
    }

    public void splitBySum(int sum) {
        Node current = head;
        Node start = null;
        Node prev = null;
        int currentSum = 0;

        while (current != null) {
            currentSum += current.data;
            if (currentSum == sum) {
                start = (prev != null) ? prev.next : head;
                Node end = current.next;
                if (prev != null) {
                    prev.next = null;
                } else {
                    head = null;
                }
                System.out.print("sublist ");
                displayList(start);
                current = end;
                currentSum = 0;
            } else if (currentSum > sum) {

                currentSum = 0;
                if (prev != null) {
                    prev.next = null;
                }
                current = current.next;
            } else {
                prev = current;
                current = current.next;
            }
        }

        if (head != null) {
            System.out.print("remaining list ");
            display();
        }
    }

    private void displayList(Node start) {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Task6 list = new Task6();

        list.addLast(10);
        list.addLast(5);
        list.addLast(4);
        list.addLast(11);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);

        System.out.println("original list ");
        list.display();

        list.splitBySum(16);
    }
}
