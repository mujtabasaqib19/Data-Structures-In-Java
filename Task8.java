public class Task8 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class Palindrome {
        Node head;
        Node tail;
        int size;

        Palindrome() {
            this.size = 0;
        }

        void insert(int data) {
            Node node = new Task8().new Node(data);
            if (head == null) {
                head = node;
                tail = node;
            } else {
                tail.next = node;
                tail = node;
            }
            size++;
        }
        void display() {
            if (head==null){
                System.out.println("list is empty");
                return;
            }
            Node currnode=head;
            while (currnode!=null){
                System.out.println(currnode.data +" ");
                currnode=currnode.next;
            }
            System.out.println("END");
        }

        boolean isPalindrome() {
            if (head == null || head.next == null) {
                return true;
            }
            Node prevSlow = null;
            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                Node nextSlow = slow.next;
                slow.next = prevSlow;
                prevSlow = slow;
                slow = nextSlow;
            }
            Node otherHalf;
            if (fast == null) {
                otherHalf = slow;
            } else {
                otherHalf = slow.next;
            }

            boolean isPalindrome = true;

            while (prevSlow != null && otherHalf != null) {
                if (prevSlow.data != otherHalf.data) {
                    isPalindrome = false;
                    break;
                }
                prevSlow = prevSlow.next;
                otherHalf = otherHalf.next;
            }

            return isPalindrome;
        }
    }
    public static void main(String[] args) {
        Palindrome list = new Task8.Palindrome();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(3);
        list.insert(2);
        list.insert(1);

        list.display();
        if (list.isPalindrome()) {
            System.out.println("it is a palindrome linked list");
        } else {
            System.out.println("it is not a palindrome linked list");
        }
    }
}
