public class LinkedListTypes {
    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class Jetha{
       Node head;

       void addAtFirst(int data){
           Node newNode  = new Node(data);

           if(head == null){
               head = newNode;
               return;
           }

           newNode.next = head;
           head.prev = newNode;
           head = newNode;
       }
       void addAtLast(int data){
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
          newNode.prev = current;
       }
       void printForward(){
           System.out.println("Doubly Linkedlist----->");
         Node current = head;
         while(current != null){
             System.out.print(current.data + " ⇄ ");
             current = current.next;
         }
           System.out.println("null");
       }
    }

    public static void main(String[] args) {
       Jetha list = new Jetha();
       list.addAtLast(10);
       list.addAtLast(20);
       list.addAtLast(30);
       list.addAtLast(40);

       list.printForward();

       list.addAtFirst(5);
       list.printForward();
    }
}
