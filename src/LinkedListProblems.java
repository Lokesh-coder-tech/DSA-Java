
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

        Node middleOfTheLikedlist(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null ){
                slow = slow.next;
                fast = fast.next.next;     //TC=O(n), SC=O(1)
            }
            return slow;

        }

        boolean cycleDetect(){
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;

                if(slow == fast){
                    return true;     //TC=O(n), SC=O(1)
                }
            }
            return false;
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
        list.addLast(50);

        list.printList();

        System.out.println(list.cycleDetect());

        Node middle = list.middleOfTheLikedlist();
        System.out.println("Middle element of the linked list: " + middle.data);

        list.reverseLinkedList();
        list.printList();



    }
}
