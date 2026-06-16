package LinkedList;
class Node{
	int data;
	Node next;
}
public class SLL {
	Node head,tail;
	public void creation(int value)
	{
		head=new Node();
		Node node=new Node();
		node.data=value;
		node.next=null;
		head=tail=node;
	}
	public void insertionSLL(int index,int value) {
		Node node=new Node();
		node.data=value;
		if(index==0)
		{
			node.next=head;
			head=node;
		}
		else {
			node.next=null;
			tail=tail.next=node;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
