/****************************************************************
 Problem statement

You are given a Singly Linked List of integers. You have to return true if the linked list is palindrome, else return false.


A Linked List is a palindrome if it reads the same from left to right and from right to left.


Example:

The lists (1 -> 2 -> 1), (3 -> 4 -> 4-> 3), and (1) are palindromes, while the lists (1 -> 2 -> 3) and (3 -> 4) are not.


 
 
 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static Node findMiddle(Node head){
        Node f=head;
        Node ff=head;
        while(ff!=null  && ff.next!=null && ff.next.next!=null){
            f=f.next;
            ff=ff.next.next;
        }
        return f;
    }
    public static boolean isPalindrome(Node head) {
        // write your code here
        if(head==null || head.next==null){
            return true;
        }
        Node m=findMiddle(head);
        Node r=reverse(m.next);
        Node h=head;
        while(r!=null){
            if(r.data!=h.data){
                return false;
            }
            r=r.next;
            h=h.next;
            
        }
        return true;

    }
}
