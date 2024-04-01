public class merge {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }
    public static merge insert(merge list, int data) {
        Node node = new Node(data);
        node.next = null;
        if (list.head == null) {
            list.head = node;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
        return list;
    }

    public static void display(merge list) {
        Node currNode = list.head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
    public static merge merge(merge list1, merge list2) {
        if (list1.head == null) {
            return list2;
        }
        Node last = list1.head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = list2.head;
        return list1;
    }

    public static void main(String[] args) {
        merge L = new merge();
        L=insert(L, 1);
        insert(L, 3);
        insert(L, 5);
        insert(L, 7);

        merge M = new merge();
        M = insert(M, 9);
        insert(M, 11);
        insert(M, 13);
        insert(M, 15);

        merge new_list = new merge();
        new_list = merge(L, M);
        display(new_list);
    }
}
