#include<iostream>
using namespace std;
//FIFO Queue - Waiting queue
// LIFO Stack - Gmail etc
Class Stack {
	private:
		int a[100];
		int top=0; 
	public:
		void push(int x){
			top++;
			a[top]=x;
		}
		int push(){
			if(top>=0){c=a[top];
			top--;
			return c;}
			else{
				return -1;
			}
		}
};
