import java.util.*;
class Node
{
    public int data;
    public Node next;
}
class Deqsll
{ 
    public Node f;
    public Node r;
    Deqsll()
    {
        f=null;
        r=null;
    }
    public boolean isEmpty()
    {
        if(f==null)
          return true;
        else
           return false;
    }
    public void enqueFirst(int ele)
    {
        Node t=new Node();
        t.data=ele;
        t.next=null;
        if(f==null)
        {
            f=t;
            r=t;
        }
        else{
            t.next=f;
            f=t;
        }
    }
    public void enqueLast(int ele)
    {
        Node t=new Node();
        t.data=ele;
        t.next=null;
        if(r==null)
        {
            f=t;
            r=t;
        }
        else{
            r.next=t;
            r=t;
        }
    }
    public int dequeFirst()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        Node t=new Node();
        t=f;
        int dlt=t.data;
        if(f==r)
        {
            f=null;
            r=null;
        }
        else
           f=f.next;
        return dlt;
    }
    public int dequeLast()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        Node t=new Node();
        t=f;
        Node k=new Node();
        k=null;
        if(f==r)
        {
            int del=t.data;
            f=null;
            r=null;
            return del;
        }
        else
        {
            while(t.next!=null)
            {
                k=t;
                t=t.next;
            }
            int dlt=t.data;
            r=k;
            r.next=null;
            return dlt;
        }
    }
    public void display()
    {
        Node t =new Node();
        t=f;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue elements are..");
            while(t!=null)
            {
                System.out.println(t.data+" ");
                t=t.next;
            }
        }
    }
}
class Prgrm17
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        Deqsll d=new Deqsll();
        System.out.println("Enter elm into Queue(-1 to stop) at last");
        int e=s.nextInt();
        while(e!=-1)
        {
            d.enqueLast(e);
            System.out.println("Enter elem into queue");
            e=s.nextInt();
        }
        d.display();
        System.out.println("Enter elem to insert at First");
        e=s.nextInt();
        d.enqueFirst(e);
        System.out.println("After insertion");
        d.display();
        int del=d.dequeLast();
        System.out.println("Deleting elemnt at last " +del);
        d.display();
        int del2=d.dequeFirst();
        System.out.println("Deleting elemnt at first "+del2);
        d.display();

    }
}