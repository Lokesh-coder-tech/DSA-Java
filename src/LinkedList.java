public class LinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Champak{
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

        void addFirst(int data){
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        void deleteFirst(){
            if(head == null){
                return;
            }
            head = head.next;
        }

        void deleteLast(){
            if(head == null){
                return;
            }
            if(head.next == null){
                head = null;
                return;
            }
            Node current = head;
            while(current.next.next != null){
                current = current.next;
            }
            current.next = null;
        }

        void deleteByValue(int value){
            if(head == null){
                return;
            }
            if(head.data == value){
                head = head.next;
                return;
            }
            Node current = head;

            while(current.next != null && current.next.data != value){
                current = current.next;
            }
            if(current.next != null){
                current.next = current.next.next;
            }
        }

        boolean search(int value){
           Node current = head;
           while(current != null){
              if(current.data == value){
                  return true;
              }
              current = current.next;
           }
           return false;
        }

        void addAtPosition(int data, int position){
            Node newNode = new Node(data);

            if(position == 0){
                newNode.next = head;
                head = newNode;
                return;
            }
            Node current = head;
            for(int i=0; i<position-1; i++ ){
                current = current.next;
            }

            newNode.next = current.next;
            current.next = newNode;
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
       Champak list = new Champak();
       list.addLast(10);
       list.addLast(20);
       list.addLast(30);
       list.addLast(40);
       list.addFirst(5);
       list.addLast(50);

       list.printList();

        list.addAtPosition(2, 0);
        list.printList();

//       if(list.search(40)){
//           System.out.println("Found");
//       }
//       else{
//           System.out.println("Not found");
//       }


//       list.deleteByValue(20);
//       list.printList();

//        list.deleteByValue(50);
//        list.printList();

//       list.deleteFirst();
//       list.printList();
//
//       list.deleteLast();
//       list.printList();
    }
}
