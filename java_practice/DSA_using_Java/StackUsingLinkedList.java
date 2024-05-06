class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class Stack {
	Node top;
	
	Stack() {
		this.top = null;
	}
	boolean isEmpty() {
		return (top == null);
	}
	void push(int data) {
		Node node = new Node(data);
		node.next = top;
		top = node;
		System.out.println(data + " pushed to stack");
	}
	
	int pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int popped = top.data;
		top = top.next;
		return popped;
	}
	int top() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		return top.data;
	}
}
public class StackUsingLinkedList {
	public static void main(String[] args) {
		Stack stack = new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		System.out.println(stack.pop() + " popped from stack");
		
		System.out.println("Top element is: " + stack.top());
	}
}
