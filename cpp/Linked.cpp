#include<iostream>
using namespace std;
struct node{
    int data;
    node* next;
};
struct Headnode{
    node* head;
    int count;
};
struct node * top=NULL;
class Stack{
    private:
    node * top=nullptr;
    int count=0;
    public:
    void push(int x){
        node* n=new node;
        n->data=x;
        if(top==NULL){
            n->next=NULL;
            top=n;
        }
        else{
            n->next=top;
            top=n;
        }
        count++;
        cout<<"Inserted "<<n->data;
    }
    void display(){
        node * temp= top;
        cout<<"\nCount "<<count<<endl;
        while(temp!=NULL){
            cout<<temp->data<<"--> ";
            temp=temp->next;
        }
    }
    void pop(){
        node* temp=top;
        top=top->next;
        cout<<temp->data;
        free(temp);
    }
};
int main(){
    Stack s;
    s.push(10);
    s.push(20);
    s.push(40);
    s.display();
    s.pop();
    s.display();
}