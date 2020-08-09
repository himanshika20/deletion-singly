import java.util.Scanner;
public class deletion2 
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
	public void push(int data)
	{
			Node n1=new Node(data);
			n1.next=head;
			head=n1;		
	}
	void deleteMiddle()
	{
		Node n4=head;
		int count=0;
		while(n4!=null)
		{
			count++;
			n4=n4.next;
		}
		int i=0;
		Node n5=head;
		Node n6=null;
		while(n5!=null)
		{
			 if(i==count/2)
			 {
				 n6.next=n5.next;
				 break;
			 }
			 n6=n5;
			 n5=n5.next;
			i++;
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
	deletion2 d=new deletion2();
	for(int i=0;i<n;i++)
	{
		d.push(s.nextInt());
	}
	d.deleteMiddle();
	d.printlist();
}
}
