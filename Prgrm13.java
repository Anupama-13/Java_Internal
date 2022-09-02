import java.util.*;
class Node
{
    public int data;
    public Node lptr,rptr;
}
class Dlist
{
    public Node l;
    public Dlist()
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
            n.lptr=null;
            n.rptr=null;
            if (l==null)
            {
                l=n;
                t=n;
            }
            else
            {
                t.rptr=n;
                n.lptr=t;
                t=n;
            }
            System.out.println("Enter element");
            d=s.nextInt();
        }
    }
    public void delete()
    {
        Node k,t;
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
        while(t.data!=ele && t!=null)
        {
            k=t;
            t=t.rptr;
        }
        if(t==l)
        {
            de=l.data;
            l=l.rptr;
            l.lptr=null;
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
                k.rptr=t.rptr;
                t.rptr.lptr=k;
            }
        }
        System.out.println("Deleted element is "+ de);
    }
    public void display()
    {
        Node t= new Node();
        Node k =new Node();
        t=l;
        if(t==null)
          System.out.println("List is empty");
        else{
            System.out.println("List elemnets are....");
            //System.out.println("From Left to Right");
            while(t!=null)
            {
                k=t;
                System.out.print("-->"+t.data);
                t=t.rptr;
            }
        }
    }
}
class Prgrm13
{
    public static void main(String args[])
    {
        int ch;
        Scanner s1 =new Scanner(System.in);
        Dlist s=new Dlist();
        s.create();
        s.display();
        s.delete();
        System.out.println("After deletion ");
        s.display();
    }
}