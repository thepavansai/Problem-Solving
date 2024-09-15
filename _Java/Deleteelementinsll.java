import java.util.* ;
import java.io.*; 
/****************************************************************
    Following is the Linked List node structure

    class Node {
    public:
        int data;
        Node *next;
        Node(int data) {
            this->data = data;
            this->next = NULL;
        }
    };
    You are given a Singly Linked List of integers and an integer 'K'. 
    Your task is to remove all such nodes from the linked list whose value is equal to 'K'.

*****************************************************************/

public class Solution {
    public static Node removeNodes(Node head, int k) {
        // Write your code here.
        while(head!=null && head.data==k){
            head=head.next;
        }
        Node temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.next.data==k){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        return head;
    }
}