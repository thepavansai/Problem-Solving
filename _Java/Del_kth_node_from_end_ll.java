/****************************************************************
 Problem statement

You have been given a singly Linked List of 'N' nodes with integer data and an integer 'K'.


Your task is to remove the 'K'th node from the end of the given Linked List and return the head of the modified linked list.


Example:

Input : 1 -> 2 -> 3 -> 4 -> 'NULL'  and  'K' = 2
Output: 1 -> 2 -> 4 -> 'NULL'
Explanation:
After removing the second node from the end, the linked list become 1 -> 2 -> 4 -> 'NULL'.

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution
{
    public static Node removeKthNode(Node head, int K)
    {
        // Write your code here.
        int n=0;
        Node temp= head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        int i=n-K+1;
        Node t=head;
        Node prev=null;
        if(i==1){
            Node re=head.next;
            return re;
        }
        while(i>1){
            prev=t;
            t=t.next;
            i--;
        }
        prev.next=t.next;
        
        return head;
    }
}
