public class SingleLL {
    private Node head;
    private Node tail;
    private int size;

    public SingleLL() {
        this.size = 0;
    }
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void addfirst(int data){
        Node newnode=new Node(data);
        if (head==null) {
            head = newnode;
            tail = newnode;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(int data){
        Node newnode=new Node(data);
        if(tail==null){
            addfirst(data);
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void mergeSort() {
        head = mergeSort(head);
    }
    private Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node middle = getmid(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;

        Node left = mergeSort(head);
        Node right = mergeSort(nextOfMiddle);

        Node sortedList = sortedMerge(left, right);
        return sortedList;
    }

    private Node getmid(Node h) {
        if (h == null) {
            return h;
        }
        Node slow = h, fast = h.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node sortedMerge(Node head1, Node head2) {
        Node result = null;
        if (head1 == null)
            return head2;
        if (head2 == null)
            return head1;

        if (head1.data <= head2.data) {
            result = head1;
            result.next = sortedMerge(head1.next, head2);
        } else {
            result = head2;
            result.next = sortedMerge(head1, head2.next);
        }
        return result;
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data+" -> ");
            current = current.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        list.addlast(10);
        list.addlast(9);
        list.addlast(8);
        list.addlast(7);
        list.addlast(6);
        list.addlast(5);
        list.addlast(4);
        list.addlast(3);
        list.addlast(2);
        list.addlast(1);

        System.out.println("original list ");
        list.display();

        list.mergeSort();

        System.out.println("sorted list ");
        list.display();
    }
}
