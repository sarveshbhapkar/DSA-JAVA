package LinkedList;

public class SinglyLinkedList {

    private ListNode head;
 
    private static class ListNode {
       private int data; // Can be a generic type
       private ListNode next; // Reference to next ListNode in list
 
       public ListNode(int data) {
          this.data = data;
          this.next = null;
       }
    }
 
    public void display() {
       ListNode current = head;
       while (current != null) {
          System.out.print(current.data + " --> ");
          current = current.next;
       }
       System.out.print("null");
       System.out.println();
    }


    public int length(){
       
        if (head == null) {
            return 0;

        }
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;

            current =current.next;

        }
        return count;

    }
     public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();

        sl.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fourth = new ListNode(40);
        ListNode fifth = new ListNode(50);

        //now will connect together to form a chain
        sl.head.next = second;
        second.next  = third;
        third.next = fourth;
        fourth.next = fifth;

        sl.display();
        System.out.println("length of singly linked list is " + sl.length());

        
     }
 }
