import java.io.*;
public class MiddleElement 
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public void printmiddle()
	{
		Node slow_ptr= head;
		Node fast_ptr= head;
		
		while(fast_ptr!=null  && fast_ptr.next!=null)
		{
			fast_ptr= fast_ptr.next.next;
			slow_ptr= slow_ptr.next;
		}
		System.out.println("The middle element is [" + slow_ptr.data +"]");
	}
	
	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next= head;
		head=new_node;
	}
	public void print()
	{
		Node t = head;
		while(t!= null)
		{
			System.out.println(t.data +"->");
			t = t.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args)
	{
		MiddleElement me = new MiddleElement();
		for(int i=5; i>0;i--)
		{
			me.push(i);
			me.print();
			me.printmiddle();
		}
	}
}
