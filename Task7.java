public class Task7 {
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node insertAtLast(Node head, int value) {
        Node node = new Node(value);
        if (head == null) {
            return node;
        } else {
            Node currnode = head;
            while (currnode.next != null) {
                currnode = currnode.next;
            }
            currnode.next = node;
        }
        return head;
    }

    public Node even(Node head) {
        Node oddh = null;
        Node oddt = null;
        Node evenh = null;
        Node event = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data%2 == 0) {
                if (evenh == null) {
                    evenh = curr;
                    event = evenh;
                } else {
                    event.next = curr;
                    event = curr;
                }
            } else {
                if (oddh == null) {
                    oddh = curr;
                    oddt = oddh;
                } else {
                    oddt.next = curr;
                    oddt = curr;
                }
            }
            curr = curr.next;
        }
        if (event!=null) {
            event.next = oddh;
        }
        if (oddt!=null) {
            oddt.next = null;
        }
        if (evenh!=null) {
            return evenh;
        } else {
            return oddh;
        }
    }
    public void printList(Node head) {
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        Node currnode=head;
        while (currnode!=null){
            System.out.println(currnode.data+" ");
            currnode=currnode.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        Task7 list = new Task7();
        Node head = null;
        head = list.insertAtLast(head,1);
        head = list.insertAtLast(head,2);
        head = list.insertAtLast(head,3);
        head = list.insertAtLast(head,4);

        head = list.even(head);

        list.printList(head);
    }
}
