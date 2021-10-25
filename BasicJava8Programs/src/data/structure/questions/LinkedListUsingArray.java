package data.structure.questions;

class Node{
	int value;
	Node next;
}

class LinkedList{

	public Node getNewNode(int value){
		Node newNode = new Node();
		newNode.value = value;
		newNode.next = null;
		return newNode;
	}
	
	public Node insert(Node node, int value){
		if(node==null){
			return getNewNode(value);
		}else{
			node.next = insert(node.next, value);
		}
		return node;
	}
	
	public void printNode(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.value);
		printNode(node.next);
	}
	
	public Node insertElemntInFront(Node root, int value){
		Node node = getNewNode(value);
		node.next=node;
		return node;
	}
	
	//public Node reverseList(Node node){
		
	//}
	
	
}

public class LinkedListUsingArray {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		Node root = null;
		root = list.insert(root, 10);
		root = list.insert(root, 20);
		root = list.insert(root, 30);
		
		list.printNode(root);
		
		root = list.insertElemntInFront(root, 5);
		
		list.printNode(root);
	}
}
