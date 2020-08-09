import java.util.Scanner;
public class deletion4 {
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
	public void printlist()
	{
		Node n3=head;
		while(n3!=null)
		{
			System.out.println(n3.data);
			n3=n3.next;
		}
	}
	void deleteDuplicate()
	{
		Node n4=head;
		Node n5=null;
		while(n4!=null&&n4.next!=null)
		{
			n5=n4;
			while(n5.next!=null)
			{
				if(n4.data==n5.next.data)
				{
					n5.next=n5.next.next;
				}
				else
				n5=n5.next;
			}
			n4=n4.next;
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		deletion4 d=new deletion4();
		for(int i=0;i<n;i++)
		{
			d.push(s.nextInt());
		}
		d.deleteDuplicate();
		d.printlist();
	}

}
