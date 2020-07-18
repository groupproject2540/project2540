// this is the node, should be a double linked list for easy relink 
public class Node {
	// this node contains value and 2 pointer 
	// to simplify the programming, ignore all security protocol
	public char value; 
	public Node prev; 
	public Node next;
	// basic contructor 
	public Node() {
		this('\0',null, null);
	}
		public Node(char value, Node next, Node prev) {
		this.value = value; 
		this.prev= prev; 
		this.next=next;
	}
	
}
