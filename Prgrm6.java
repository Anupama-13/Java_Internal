import java.util.*;
class Node
{
    public int data;
    public Node next;
}
class Qll
{
    public Node f;
    public Node r;
    Qll()
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
    public void enqueue(int ele)
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
    public int dequeue()
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
class Prgrm6
{
    public static void main(String args[])
    {
        Scanner s1 =new Scanner(System.in);
        Qll q=new Qll();
        System.out.println("Enter elm into Queue(-1 to stop)");
        int e=s1.nextInt();
        while(e!=-1)
        {
            q.enqueue(e);
            System.out.println("Enter elem into queue");
            e=s1.nextInt();
        }
        q.display();
        int d =q.dequeue();
        System.out.println("The deleted elemt is"+d);
        System.out.println("After deletion ");
        q.display();

    }
}