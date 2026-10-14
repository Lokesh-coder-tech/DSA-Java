
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

        void createCycle(){
            Node second = head.next;
            Node last = head;

            while(last.next != null){
                last = last.next;
            }
            last.next = second;
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

        void removeCycle(){
           Node slow = head;
           Node fast = head;

           while(fast != null && fast.next != null){
               slow = slow.next;
               fast = fast.next.next;

               if(slow == fast){
                   break;
               }
           }
           if(fast == null || fast.next == null){
               return;
           }

           slow = head;

           while(slow != fast){
               slow = slow.next;
               fast= fast.next;
           }

           Node cycleStart = slow;
           Node current = cycleStart;
           while(current.next != cycleStart ){
               current = current.next;
           }
           current.next = null;
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

        list.createCycle();

        System.out.println(list.cycleDetect());

        list.removeCycle();
        System.out.println(list.cycleDetect());
//
//        Node middle = list.middleOfTheLikedlist();
//        System.out.println("Middle element of the linked list: " + middle.data);
//
//        list.reverseLinkedList();
//        list.printList();



    }
}
