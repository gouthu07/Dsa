package dsa.queue;

public class queue_opt {
	
	int[] queue;
	int toq;
	int boq;
	
	public queue_opt(int size)
	{
		queue=new int[size];
		toq=boq=-1;
	}
	
	public boolean isFull() {
		return toq==queue.length;
	}
	
	public boolean isEmpty() {
		return boq==-1||boq==queue.length;
	}
	
	public void enqueue(int value) {
		if(isFull())
		{
			System.out.println("Queue is full");
		}
		else if(boq==-1)
		{
			boq=0;
			queue[++toq]=value;
			System.out.println("Value is inserted");
		}
		else {
			queue[++toq]=value;
			System.out.println("value is inserted");
		}
	}
	
	public void dequeue() {
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else {
			int value=queue[boq];
			boq++;
			if(boq>toq)
			{
				boq=toq=-1;
			}
			System.out.println("Value is removed");
		}
	}
	
	public void traverse() {
		for(int i=0;i<queue.length;i++)
		{
			System.out.print(queue[i]+" ");
		}
	}
	
	public void peek() {
		if(isEmpty())
		{
			System.out.println("empty");
		}
		else {
			System.out.println("Peek element is:-"+queue[boq]);
		}
	}
	
	public void delete() {
		queue=null;
		System.out.println("queue is deleted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue_opt q=new queue_opt(5);
//		q.enqueue(2);
//		q.enqueue(3);
//		q.enqueue(1);
//		q.enqueue(5);
//		q.enqueue(4);
////		
//		
////		q.peek();
////		
////		q.dequeue();
////		
////		q.traverse();
////		
////		q.dequeue();
////		q.dequeue();
////		
////		q.traverse();
////		
//		q.delete();
		
//		q.traverse();
//		q.dequeue();
//		q.traverse();
		System.out.println(q.isEmpty());
		q.traverse();
	}

}
