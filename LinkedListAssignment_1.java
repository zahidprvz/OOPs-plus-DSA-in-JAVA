import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    LinkedList() {
        this.head = null;
    }

    // add element to end of linked list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // remove element from linked list
    public void remove(int data) {
        if (head == null) {
            System.out.println("List is empty.");
        } else if (head.data == data) {
            head = head.next;
        } else {
            Node current = head;
            Node prev = null;
            while (current != null && current.data != data) {
                prev = current;
                current = current.next;
            }
            if (current == null) {
                System.out.println("Element not found.");
            } else {
                prev.next = current.next;
            }
        }
    }

    // search for element in linked list
    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // display elements in linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

class LinkedListAssignment_1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("");
            System.out.println("1. Add element to list");
            System.out.println("2. Remove element from list");
            System.out.println("3. Search for element in list");
            System.out.println("4. Display elements in list");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int addData = sc.nextInt();
                    list.add(addData);
                    System.out.println("Element added.");
                    break;
                case 2:
                    System.out.print("Enter element to remove: ");
                    int removeData = sc.nextInt();
                    list.remove(removeData);
                    System.out.println("Element removed.");
                    break;
                case 3:
                    System.out.print("Enter element to search for: ");
                    int searchData = sc.nextInt();
                    if (list.contains(searchData)) {
                        System.out.println("Element found.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                case 4:
                    System.out.print("Linked List: ");
                    list.display();
                    break;
                case 0:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
        sc.close();
    }
}
