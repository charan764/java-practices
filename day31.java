//linked list array
public class day31 {
    public static void main(String[] args){
       Linkedlist l= new Linkedlist();
       l.add(20);
       l.add(30);
       l.add(40);

       l.print();
    }
}
class Linkedlist {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = newNode;
        }

    }
    public void print()
    {
        Node n = head;
        while (n != null) {
            System.out.println(n.data + " ");
        }
    }

}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next = null;
    }
}