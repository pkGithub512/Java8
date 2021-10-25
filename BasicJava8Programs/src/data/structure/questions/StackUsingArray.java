package data.structure.questions;

public class StackUsingArray {
	int top;
	int capacity;
	int stack[]; 
	
	StackUsingArray(){
		this.top=-1;
		this.capacity=5;
		this.stack = new int[capacity];
	}
	
	public void push(int num){
		if(top==capacity){
			System.out.println("Overflow. Please delete element");
		}
		top++;
		stack[top] = num; 
	}
	
	public int pop(){
		if(top==-1){
			System.out.println("Stack is empty. Please insert element");
		}
		return stack[top--];
	}
	
	public int peek(){
		return stack[top];
	}
	
	public void display(){
		for (int i : stack) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//stack.push(60);
		stack.display();
		System.out.println(stack.peek());
		stack.pop();
		stack.push(60);
		stack.display();
		System.out.println(stack.peek());
	}
}
