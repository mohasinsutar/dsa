package ds.problem1;
//write a method which takes a Node and deletes from Linked List without head pointer
class Node{
	int data;
	Node next;
}
class SingleLinkedList {
	public SingleLinkedList() {
	}
	//Declared head as private so it is not accessible out of class
	private Node head = null;
	public Node add(int data) {
		//Initialize new Node
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
	
		if(head == null) {
			//List is empty so insert at begining
			head = newNode;
			return head;
		}
		else {
			Node current = head;
			while(current.next != null) {
				//Iterate fully over List
				current = current.next;
			}
			//add New Node here
			current.next = newNode;
			return newNode;
		}
	}
	public void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		while(current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println("");
	}
}
public class Problem1 {
		
	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		list.add(10);
		list.add(20);
		list.add(40);
		Node delNode = list.add(30); //Node with Value 30 to be deleted
		list.add(50);
		list.add(60);
		list.display();
		deleteNode(delNode);
		list.display();
	}
	public static void deleteNode(Node delNode) {
		//create a temp reference to the next node of delNode;
		Node temp = delNode.next;
		//overwrite data of delNode with temp
		delNode.data = temp.data;
		//overwite next reference of delNode with temp
		delNode.next = temp.next;
	}
}
