package LinkedList;


public class practicesll {
	Node head,tail;
	public void creation(int value)
	{
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
	    	if (temp == null) {
                System.out.println("Invalid Index");
                return;
            }
	    	
	    	
	        temp = temp.next;
	    }
	    
	    if (temp == null) {
            System.out.println("Invalid Index");
            return;
        }

	    newNode.next = temp.next;
	    temp.next = newNode;
	    
	    if (newNode.next == null) {
            tail = newNode;
        }
	}
	
	public void deleteatfirst()
	{
		if(head==null)
		{
			System.out.println("list is empty");
			return;
		}
		head=head.next;
		if(head==null)
		{
			tail=null;
		}
	}
	
	public void deleteatlast()
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
		Node temp=head;
		while(temp.next!=tail)
		{
			temp=temp.next;
		}
		temp.next=null;
		tail=temp;
	}
	
	public void deleteatspecificpositon(int index)
	{
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(index==0)
		{
			head=head.next;
			if(head==null)
			{
				tail=null;
			}
			return;
		}
		Node temp=head;
		for(int i=0;i<index-1;i++)
		{
			temp=temp.next;
		}
		temp.next=temp.next.next;
		if(temp.next==null)
		{
			tail=temp;
		}
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
	
	public void Length()
	{
		Node temp=head;
		int cnt=0;
		while(temp!=null)
		{
			temp=temp.next;
			cnt++;
		}
		System.out.println(cnt);
	}
	
	public void search(int value)
	{
		int index=0;
		Node temp=head;
		while(temp!=null)
		{
			if(temp.data==value)
			{
				System.out.println(index);
				return;
			}
			index++;
			temp=temp.next;
		}
		System.out.println("The value not found");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practicesll p=new practicesll();
		p.creation(10);
		p.insertAtIndex(1, 20);
		p.insertAtIndex(2, 30);
		p.insertAtIndex(3, 40);
		p.insertAtIndex(2, 25);
//		p.deleteatfirst();
//		p.deleteatlast();
//		p.deleteatspecificpositon(1);
		p.traverse();
		p.Length();
		p.search(40);
	}

}
