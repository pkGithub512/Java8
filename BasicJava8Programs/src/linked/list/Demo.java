package linked.list;

class Node{
	int value;
	Node next;
}
class LinkedList{
	
	public Node insert(int i, Node node){
		if(node == null){
			return getNewNode(i);
		}else{
			node.next = insert(i, node.next);
		}
		return node;
	}

	private Node getNewNode(int i) {
		Node newNode = new Node();
		newNode.value = i;
		newNode.next = null;
		return newNode;
	}
	
	public void printNode(Node node){
		if(node == null){
			return;
		}
		System.out.println(node.value);
		printNode(node.next);
	}
	
	public Node insertElementFront(int i, Node node){
		Node a = getNewNode(i);
		a.next = node;
		return a;
	}
	
	public Node reverseList(Node node){
		
		Node prev = null;
		
		while(node!=null){
			Node next_node = node.next;
			node.next=prev;
			prev = node;
			node = next_node;
		}
		
		return prev;
	}
}

public class Demo {

	public static void main(String[] args) {
		Node root = null;
		LinkedList list1 = new LinkedList();
		root = list1.insert(10, root);
		root = list1.insert(80, root);
		root = list1.insert(20, root);
		root = list1.insert(50, root);
		
		//list1.printNode(root);
		
		root = list1.insertElementFront(5, root);
		
		//list1.printNode(root);
		
		root = list1.reverseList(root);
		
		list1.printNode(root);
	}

}
