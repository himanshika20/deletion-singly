import java.util.Scanner;
 public class deletion 
{
	public Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int x)
		{
			data=x;
			next=null;
		}
	}
	public void push(int data)
	{
			Node n1=new Node(data);
			n1.next=head;
			head=n1;		
	}
	void deleteElement(int x)
	{
	Node n2=head;
	Node n3=null;
	if(head.data==x)
	{
		head=n2.next;
	}
	else
	{
	while(n2!=null)
	{
		if(n2.data==x)
		{
			n3.next=n2.next;
			break;
		}
		n3=n2;
		n2=n2.next;
	}
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
	public static void main(String[] args)
{
		Scanner s=new Scanner(System.in);
int n=s.nextInt();
deletion d=new deletion();
for(int i=0;i<n;i++)
{
	d.push(s.nextInt());
}
d.deleteElement(s.nextInt());
d.printlist();
}
}