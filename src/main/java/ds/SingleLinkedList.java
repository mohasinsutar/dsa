package ds;

public class SingleLinkedList {
	class Node{
		int data;
		Node next;
	}
	public Node head = null;
	public void add(int data) {
		//Initialize new Node
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
	
		if(head == null) {
			//List is empty so insert at begining 
			head = newNode;
		}
		
		Node current = head;
		while(current.next != null) {
			//Iterate fully over List
			current = current.next;
		}
		//add New Node here
		current.next = newNode;
		
	}
	public void add(int data,int position) {
		
		if(position <= 0) {
			System.out.println("Invalid index");
			return;
		}
		if(head != null && position == 1) {
			//insertion at start of list
			Node newNode = new Node();
			newNode.data = data;
			
			newNode.next = head;
			head = newNode;
			return;
		}
		else {
			Node current = head;
            while(position-- !=  0) {
            	//System.out.println(position + "" + current.data);
            	if(position == 1) {
            		//Insert new Node here
            		Node newNode = new Node();
        			newNode.data = data;
        			
        			newNode.next = current.next;
        			current.next = newNode;
        			break;
            	}
            	current = current.next;
            }
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
	public static void main(String[] args) {
		SingleLinkedList myList = new SingleLinkedList();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		myList.display();
		myList.add(99, 3);
		myList.display();
	}
}
