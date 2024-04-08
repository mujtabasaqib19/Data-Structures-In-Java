 class DoubleLL {
     Node head;

     public void insertFirst(int data) {
         Node node = new Node(data);
         node.next = head;
         if (head != null) {
             head.prev = node;
         }
         head = node;
     }

     public void insertChild(int parentData, int childData) {
         Node parentNode = find(parentData);
         if (parentNode == null) {
             System.out.println("parent node not found");
             return;
         }
         Node childNode = new Node(childData);
         childNode.child = parentNode.child;
         parentNode.child = childNode;
     }

     public Node flatten(Node head) {
         if (head == null) return null;

         Node current = head;
         while (current != null) {
             if (current.child != null) {

                 Node child = flatten(current.child);

                 Node next = current.next;

                 current.next = child;
                 child.prev = current;

                 while (child.next != null) {
                     child = child.next;
                 }

                 child.next = next;
                 if (next != null) {
                     next.prev = child;
                 }

                 current.child = null;

                 current = next;
             } else {
                 current = current.next;
             }
         }

         return head;
     }

     public void displayFlattened() {
         Node curr = flatten(head);
         while (curr != null) {
             System.out.print(curr.data + " ");
             curr = curr.next;
         }
         System.out.println();
     }

     public Node find(int val) {
         Node node = head;
         while (node != null) {
             if (node.data == val) {
                 return node;
             }
             node = node.next;
         }
         return null;
     }

     class Node {
         int data;
         Node next;
         Node prev;
         Node child;

         public Node(int data) {
             this.data = data;
         }
     }
 }
    public class Task7 {
        public static void main(String[] args) {
            DoubleLL d = new DoubleLL();

            d.insertFirst(5);
            d.insertFirst(4);
            d.insertFirst(3);
            d.insertFirst(2);
            d.insertFirst(1);

            d.insertChild(3, 7);
            d.insertChild(7, 8);
            d.insertChild(8, 9);
            d.insertChild(9, 10);
            d.insertChild(8, 11);
            d.insertChild(11, 12);


            d.displayFlattened();
        }
    }