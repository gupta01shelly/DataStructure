import java.io.*;
class Node{
	int data;
	Node next;
	Node(int d)
	{
		data=d;
		next=null;
	}
}
class LinkedNode{
	Node head;
	public int NthNode(int index)
	{
		Node current=head;
		int count=0;
		while(current!=null)
		{
			if(count == index)
				return current.data;
			count++;
			current=current.next;
		}
		return 0;
	}
	public void add(int data1)
	{
		Node newnode = new Node(data1);
		newnode.next = head;
		head = newnode;
	}
	
	public static void main(String[] args)
	{
		LinkedNode link = new LinkedNode();
		link.add(2);
		link.add(1);
		link.add(15);
		link.add(7);
		link.add(3);
		link.add(5);
		
		System.out.println(link.NthNode(5));
	}
}
