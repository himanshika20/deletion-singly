import java.util.Scanner;
public class deletion1 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	public void insert(int x)
	{
		Node n=new Node(x);
		if(head==null)
		{
			head=n;
		}
		else
		{
			Node n1=head;
			while(n1.next!=null)
			{
				n1=n1.next;
			}
			n1.next=n;
		}
	}
	public void printlist()
	{
		Node n3=head;
		while(n3!=null)
		{
			System.out.println(n3.data);
			n3=n3.next;
		}
	}
	void deleteNode(int node)
	{
		Node n4=head;
		Node n5=null;
		int count=1;
		if(node==1)
		{
			head=n4.next;
		}
		else
		{
		while(n4!=null)
		{
			if(count==node)
			{
				n5.next=n4.next;
				break;
			}
			count++;
			n5=n4;
			n4=n4.next;
		}
		}
	}
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	deletion1 d=new deletion1();
	for(int i=0;i<n;i++)
	{
		d.insert(s.nextInt());
	}
	d.deleteNode(s.nextInt());
	d.printlist();
}
}
