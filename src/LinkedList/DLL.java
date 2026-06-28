package LinkedList;

public class DLL {
	Node head,tail;
	public void creation(int value)
	{
		Node node=new Node();
		node.data=value;
		node.next=node.prev=null;
		head=tail=node;
	}
	public void insertionatfirst(int value)
	{
		Node node=new Node();
		node.data=value;
		if(head==null) {
			head=tail=node;
			return;
		}
		node.next=head;
		head.prev=node;

		head=node;
	}
	
	public void insertionatlast(int value)
	{
		Node node=new Node();
		node.data=value;
		if(head==null) {
			head=tail=node;
			return;
		}
		node.prev=tail;
		tail.next=node;
		tail=node;
	}
	
	public void insertatspecificindex(int index,int value)
	{
		Node node=new Node();
		node.data=value;
		if(index==0)
		{
			node.next=head;
			head.prev=node;
			head=node;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		node.next=temp.next;
		node.prev=temp;
		temp.next.prev=node;
		temp.next=node;
	}
	
	public void traverse()
	{
		Node temp=head;
		if(head==null)
		{
			System.out.println("List is Empty");
		}
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public void reverse()
	{
		Node temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp=temp.prev;
		}
	}
	
	public void deletionatfirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(head==tail)
		{
			head=tail=null;
			return;
		}
		head=head.next;
		head.prev=null;
	}
	
	public void deletionatlast()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		if(head==tail)
		{
			head=tail=null;
			return;
		}
		tail=tail.prev;
		tail.next=null;
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		DLL d=new DLL();
		d.creation(10);
		d.insertionatlast(20);
		d.insertionatlast(30);
		//d.traverse();
//		d.deletionatlast();
//		d.reverse();
		d.deletionatfirst();
		d.deletionatlast();
		d.traverse();
	}
	
}
