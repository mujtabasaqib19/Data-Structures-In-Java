class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data) {
        this.data = data;
    }
    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class DoubleLL {
    Node head;
    public void insertfirst(int data) {
        Node node = new Node(data);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev= node;
        }
        head=node;
    }
    public void insertlast(int data){
        Node node=new Node(data);
        Node last=head;
        node.next=null;
        if(head==null){
            node.prev=null;
            head=node;
            return;
        }
        while (last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    public void display(){
        Node node=head;
        while (node!=null){
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println("end");
    }
    public Node find(int val){
        Node node=head;
        while (node!=null){
            if(node.data==val){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void insert_index(int after,int data) {
        Node p = find(after);
        if (p == null) {
            System.out.println("doesn't exist");
            return;
        }
        Node node = new Node(data);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void delete(int data) {
        if (head == null) return;
        Node temp = head;
        if (temp != null && temp.data == data) {
            head = temp.next;
            if (head != null) {
                head.prev = null;
            }
            return;
        }
        while (temp != null && temp.data != data) {
            temp = temp.next;
        }
        if (temp == null) {
            return;
        }

        if (temp.next!= null) {
            temp.next.prev = temp.prev;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }
    public static void main(String[] args) {
        DoubleLL d=new DoubleLL();
        d.insertfirst(3);
        d.insertfirst(6);
        d.insertfirst(1);
        d.insertfirst(7);
        d.insertfirst(8);
        d.insertlast(99);
        d.insert_index(6,43);
        d.display();
        d.delete(43);
        d.display();

    }
}
