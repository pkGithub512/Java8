/*package linked.list;

class Node{
	int value;
	Node next;
}

class LinkedList{
	public Node insert(int value, Node node){
		
		if(node == null){
			return getNewNode(value);
		}else{
			node.next = insert(value, node.next);
		}
		return node;
	}
	
	private Node getNewNode(int value) {
		Node newNode = new Node();
		newNode.value = value;
		newNode.next=null;
		return newNode;
	}

	public void printNodes(Node node){
		if(node==null){
			return;
		}
		System.out.println(node.value);
		printNodes(node.next);
	}
}

public class LinkedListDemo {

	public static void main(String[] args) {
		Node root = null;
		LinkedList list1 = new LinkedList();
		root = list1.insert(10, root);
		root = list1.insert(20, root);
		root = list1.insert(80, root);
		root = list1.insert(50, root);
		System.out.println("Printing");
		list1.printNodes(root);
	}
	
}
*/