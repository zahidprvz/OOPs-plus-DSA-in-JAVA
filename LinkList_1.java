import java.util.Scanner;

public class LinkList_1 {
    
    //For a LinkedList
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Head of LinkedList
    Node head = null;
    
    public void creation() {
        int data, n;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter data: ");
            data = sc.nextInt();

            Node new_node = new Node(data);

            if(head == null) {
                head = new_node;
            }
            else {
                new_node.next = head;
                head = new_node;
            }

            System.out.println("Do you want to add more data? If yes, Press 1");
            n = sc.nextInt();
        }
        while(n==1);
        sc.close();
    }

    public void traverser() {

        Node temp = head;

        if(head == null) {
            System.out.println("LL does not exists..!");
        }
        else {
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        
    }

    public static void main(String[] args) {
        LinkList_1 li = new LinkList_1();

        li.creation();
        li.traverser();
    }
}
