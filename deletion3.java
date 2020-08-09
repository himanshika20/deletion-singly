import java.util.Scanner;
public class deletion3 
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
	void deleteAfterNode(int x)
	{
		int count=0;
		Node n4=head;
		Node n5=null;
		if(x==0)
		{
			head=n4.next;
		}
		while(n4!=null)
		{
			if(x==count)
			{
				n5.next=n4.next;
				break;
			}
			n5=n4;
			count++;
			n4=n4.next;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		deletion3 d=new deletion3();
		for(int i=0;i<n;i++)
		{
			d.insert(s.nextInt());
		}
		d.deleteAfterNode(s.nextInt());
		d.printlist();
	}

}
