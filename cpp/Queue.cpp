#include<iostream>
using namespace std;
struct Node{
    int data;
    Node* next;
};
class Queue{
    private:
        Node* head;
        Node* tail;
        int count;
    public:
        Queue(){
            head= nullptr;
            tail=nullptr;
            count=0;
        };
        void enq(int x){
            Node * o= new Node;
            o->data=x;
            if(tail == nullptr){
                head=tail=o;
            }
            else{
                    tail->next=o;
                    tail=o;
            }
        }
        void display(){
            Node* temp=head;
            while(temp!=nullptr){
                cout<<temp->data<<" ";
                temp=temp->next;
            }
        }
        void deq(){
            Node * temp=head;
            head=temp->next;
            cout<<temp->data<<endl;
            free(temp);
            
        }
        
};
int main(){
    Queue q;
    q.enq(3);
    q.enq(5);
    q.enq(5);
    q.display();
    q.deq();
    q.display();
}