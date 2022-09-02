import java.util.*;
class Node
{
    public int data;
    public Node next;
}
class Slist
{
    public Node l;
    public Slist()
    {
        l=null;
    }
    public void create()
    {
        int d;
        Node n,t;
        t=new Node();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the element(-1 to stop)");
        d=s.nextInt();
        if(d==-1){
            return ;
        }
        while(d!=-1)
        {
            n=new Node();
            n.data=d;
            n.next=null;
            if (l==null)
            {
                l=n;
                t=n;
            }
            else
            {
                t.next=n;
                t=n;
            }
            System.out.println("Enter element(-1 to stop)");
            d=s.nextInt();
        }
    }
    //Deleting an integer
    public void delete()
    {
        Node n,t,k;
        t=new Node();
        k=new Node();
        int de,ele;
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter the element to be deleted");
        ele=s.nextInt();
        t=l;
        if(t==null)
        {
            System.out.println("List is empty");
        }
        while(t.data !=ele && t!=null)
        {
            k=t;
            t=t.next;
        }
        if(t==l)
        {
            de=l.data;
            l=l.next;
        }
        else
        {
            if(t==null)
            {
                System.out.println("Out of Range");
                return ;
            }
            else
            {
                de=t.data;
                k.next=t.next;
            }
        }
        System.out.println("Deleted element is "+ de);
    }
    public void display()
    {
        Node t= new Node();
        t=l;
        if(t==null)
          System.out.println("List is empty");
        else{
            System.out.println("List elemnets are....");
            while(t!=null)
            {
                System.out.print("-->"+t.data);
                t=t.next;
            }
        }
    }
}
class Prgrm3
{
    public static void main(String args[])
    {
        Scanner s1 =new Scanner(System.in);
        Slist s=new Slist();
        s.create();
        s.display();
        s.delete();
        System.out.println("After deletion ");
        s.display();
    }
}