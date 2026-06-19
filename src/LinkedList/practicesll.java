package LinkedList;


public class practicesll {
	Node head,tail;
	public void creation(int value)
	{
		head=new Node();
		Node node=new Node();
		node.data=value;
		node.next=null;
		head=tail=node;
	}
	public void insertionbegin(int value)
	{
		Node node=new Node();
		node.data=value;
		if(head==null)
		{
			head=tail=node;
		}
		else
		{
		node.next=head;
		head=node;
		}
	}
	
	public void insertatend(int value)
	{
		Node node=new Node();
		node.data=value;
		node.next=null;
		if(head==null)
		{
			head=tail=node;
		}
		else {
		tail.next=node;
		tail=node;
		}
	}
	
	public void insertAtIndex(int index, int value)
	{
	    Node newNode = new Node();
	    newNode.data = value;

	    if(index == 0)
	    {
	        newNode.next = head;
	        head = newNode;

	        if(tail == null)
	        {
	            tail = newNode;
	        }

	        return;
	    }

	    Node temp = head;

	    for(int i = 0; i < index - 1; i++)
	    {
	        temp = temp.next;
	    }

	    newNode.next = temp.next;
	    temp.next = newNode;
	}
	public void traverse()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicesll p=new practicesll();
		p.creation(10);
		p.insertAtIndex(1, 20);
		p.insertAtIndex(2, 30);
		p.insertAtIndex(3, 40);
		p.insertAtIndex(2, 25);
		p.traverse();
	}

}
