#include <cstddef>
#include<iostream>
using namespace std;
struct Node {
    int data;
    Node* prev;
    Node* next;
    Node(int data = 0) : data(data), prev(nullptr), next(nullptr) {} 
};
class Dll{
    private:
        Node* head;
       // head= new Node();
    public:
        Dll(){
            head= new Node();
        }
        void insertats(int data){
            Node* t=new Node();
            t->data=data;
            t->next = nullptr;
            t->prev = nullptr;
            if(head->next==NULL){
                head->next=t;
                t->prev=head;
                //t->next=NULL;

            }else{
            Node* temp=head->next;
            t->next=temp;
            t->prev=head;
            head->next=t;
            if(temp->next!=NULL){
                temp->prev=t;
            }
            
            }
        }
        void printt(){
            Node* temp=head->next;
            while(temp!=NULL){
                cout<<temp->data<<" ";
                temp=temp->next;
            }
        }
        void insertend(int data){
            Node * n= new Node(data);
            Node * temp=head->next;
            if(temp==NULL){
                n->prev=temp;
                temp->next=n;
            }
            else{
                while(temp->next!=nullptr){
                    temp=temp->next;
                }
                n->prev=temp;
                temp->next=n;
            }
        }
        void deleten(int data){
            Node * temp=head->next;
           // Node * pre=temp;
            while(temp!=nullptr){
                if(temp->data==data){
                    if(temp->prev!=nullptr){
                        temp->prev->next=temp->next;
                    }
                    if(temp->next!=nullptr){
                        temp->next->prev=temp->prev;
                    }
                    if(temp->prev==head){
                        head->next=temp->next;
                    }
                    delete temp;
                }
                //pre=temp;
                temp=temp->next;
            }
        }
        void revr(){
            Node* prev=nullptr;
            Node * temp=head->next;
            if (head == nullptr || head->next == nullptr) {
                return;
        }
            while(temp!=nullptr){
                prev=temp->prev;
                temp->prev=temp->next;
                temp->next=prev;
                temp=temp->prev;
            }
            Node *x=prev;

        }
        ~Dll() {
        // Destructor to clean up allocated memory
        Node* current = head;
        Node* nextNode;
        while (current != nullptr) {
            nextNode = current->next;
            delete current;
            current = nextNode;
        }cout<<endl;
    }
    
};
int main(){
    Dll d;
    d.insertats(24);
    d.insertats(45);
    d.printt();
    cout<<endl;
    d.insertend(67);
    d.printt();
    d.deleten(67);
    cout<<endl;
    d.printt();
    d.revr();
    cout<<endl;
    d.printt();
    return 0;

}