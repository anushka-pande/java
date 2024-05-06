class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}
class Queue {
	Node front, rear;
	
	Queue() {
		this.front = this.rear = null;
	}
	boolean isEmpty() {
		return (front == null);
	}
	void enqueue(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			front = rear = node;
			System.out.println(data + " enqueued to queue");
			return;
		}
		rear.next = node;
		rear = node;
		System.out.println(data + " enqueues to queue");
	}
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		int dequeued = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		return dequeued;
	}
	int front() {
		if(isEmpty()) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return front.data;
	}
}
public class QueueUsingLinkedList {
	public static void main(String[] args) {
		Queue queue = new Queue();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		
		System.out.println(queue.dequeue() + " dequeued from queue");
		
		System.out.println("Front element is " + queue.front());
	}
}
