//Task1
public class SingleLL {
    private int size;
    Node head;
    public SingleLL() {
        this.size=0;
    }
    public class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data=data;
            size++;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    //task3
    //add: add first or add last
    public void addfirst(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    //task2
    public void addlast(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node currnode=head;
        while (currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;
    }
    public void display(){
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
    //task5
    //delete first
    public void deletefirst(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        size--;
        head=head.next;
    }
    // delete last
    public void deletelast(){
        if (head==null){
            System.out.println("Empty list");
            return;
        }
        size--;
        if (head.next==null){
            head=null;
            return;
        }

        Node secondlast=head;
        Node lastNode=head.next;

        while (lastNode.next!=null){
            lastNode=lastNode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    //task6
    public void update(int prev, int new_val) {
        Node temp = head;
        while (temp!=null) {
            if (temp.data == prev) {
                temp.data = new_val;
                return;
            }
            temp = temp.next;
        }
        System.out.println("value not found");
    }
    //task4
    public void add(int new_val, int prev) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == prev) {
                Node newNode = new Node(new_val, temp.next);
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("previous value not found");
    }
    public void insert(int val,int index){
        if (index==0){
            addfirst(val);
        }
        if (index==size){
            addlast(val);
        }
        Node temp=head;
        for (int i = 1; i <index; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    //task5
    public int delete(int index) {
        if (index == 0) {
            deletefirst();
        }
        if (index == size - 1) {
            deletelast();
        }
        Node prev = get(index - 1);
        if (prev.next == null) {
            return 0;
        }
        int val = prev.next.data;
        if (index == size - 1) {
            deletelast();
            return val;
        }
        prev.next = prev.next.next;
        size--;
        return val;
    }
    private Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        SingleLL singleLL=new SingleLL();

        singleLL.addfirst(1);
        singleLL.addfirst(4);
        singleLL.addlast(7);
        singleLL.addfirst(8);
        singleLL.addfirst(10);

        singleLL.insert(7,2);
        singleLL.delete(2);
        singleLL.update(7,9);
        singleLL.display();
    }
}
