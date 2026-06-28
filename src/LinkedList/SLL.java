package LinkedList;
class Node{
	int data;
	Node next,prev;
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
	
	public void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL s=new SLL();
		s.creation(1);
		s.creation(2);
		s.creation(3);
		s.insertionSLL(1, 4);
		s.traverse();
	}

}
