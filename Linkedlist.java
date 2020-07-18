
public class Linkedlist {
	//2 sentinel point to the beg and end of a linked list 
	public Node head; 
	public Node tail; 
	public int size; 
	//constructor create head and tail 
	public Linkedlist() {
		head = new Node(); 
		tail = new Node(); 
		head.next = tail; 
		tail.next=null;
		tail.prev = head;
		head.prev=null;
		size =0; 
	}
	
	/*
	 * add function based on insert to add the end 
	 */
	public void addEnd(char input) {
		Node item = new Node(input, head, tail);
		item.prev= tail.prev;
		item.next =tail;
		tail.prev.next=item;
		tail.prev = item;
		size++;
	}

	
	/*
	 * Delete node at specific node
	 */
	public void delete(Node trash) {
			trash.prev.next = trash.next; 
			trash.next.prev = trash.prev;
	size--;
	}
	
	/*
	 * 2 while loop to check if each note is unique compare to all node come after it 
	 */
	public boolean findRepeatAndDelete() {
		boolean repeated =false;
		if(size>2) {
		Node cur = head.next; 
		Node after= cur.next; 
		while(cur != tail.prev) {
			while(after !=tail) {
				if(cur.value == after.value) {
					Node temp = after.next;
					delete(after);
					after= temp;
					repeated = true; 
				}
				else {
					after = after.next;
				}
		}
			if(cur==tail.prev) {
				return repeated;
			}	
			cur=cur.next;
				after=cur.next;
		}
		return repeated;
		}
		else {
			return repeated; 
		}
	}
	
	// print the list 
	public void print() {
		Node cur = head.next;
		while(cur!=tail) {
			System.out.print(cur.value + "->");
			cur = cur.next;
		}
	
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Cady Liu " + "110027977");
		
		Linkedlist test1 = new Linkedlist();
		test1.addEnd('a');
		
		test1.print();
		boolean res = test1.findRepeatAndDelete();
		System.out.println("Output " + res);
		test1.print();

		System.out.println("----------------------------");
		
		Linkedlist test2 = new Linkedlist();		
		test2.addEnd('D');
		test2.addEnd('A');
		test2.addEnd('T');
		test2.addEnd('A');

		test2.print();
		boolean res2 = test2.findRepeatAndDelete();
		System.out.println("Output " + res2);
		test2.print();
		
		System.out.println("----------------------------");
Linkedlist test3 = new Linkedlist();
		test3.addEnd('C');
		test3.addEnd('O');
		test3.addEnd('M');
		test3.addEnd('P');
		test3.addEnd('2');
		test3.addEnd('5');
		test3.addEnd('4');
		test3.addEnd('0');
		test3.addEnd('4');
		
		test3.print();
		boolean res3 = test3.findRepeatAndDelete();
		System.out.println("Output " + res3);
		test3.print();
		
		System.out.println("----------------------------");
		Linkedlist test4 = new Linkedlist();
		test4.addEnd('B');
		test4.addEnd('I');
		test4.addEnd('N');
		test4.addEnd('R');
		test4.addEnd('A');
		test4.addEnd('T');
		test4.addEnd('R');
		test4.addEnd('E');
		test4.addEnd('E');
		
		test4.print();
		boolean res4 = test4.findRepeatAndDelete();
		System.out.println("Output " + res4);
		test4.print();
		
	}

}
