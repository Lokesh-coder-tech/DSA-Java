
public class LinkedListProblems {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Daya{
        Node head;

        void addLast(int data){
            Node newNode = new Node(data);

            if(head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

        void reverseLinkedList(){
            Node prev = null;
            Node current = head;
            Node next = null;

            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }                              //TC=O(n), SC=O(1)
            head = prev;
        }

        void printList(){
           Node current = head;

           while(current != null){
               System.out.print(current.data + " -> ");
               current = current.next;
           }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Daya list = new Daya();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);

        list.printList();

        list.reverseLinkedList();
        list.printList();
    }
}
