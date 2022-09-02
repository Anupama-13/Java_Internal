import java.util.*;
class Node
{
    public int data;
    public Node next;
}
class StackLL
{
    public Node s;
    StackLL()
    {
        s=null;
    }
    public boolean isEmpty()
    {
        if(s==null)
          return true;
        else
          return false;
    }
    public void push(int elem)
    {
        Node t=new Node();
        t.data=elem;
        t.next=null;
        if(s==null)
           s=t;
        else{
            t.next=s;
            s=t;
        }
    }
    public int pop()
    {
        if(s==null)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            Node t=new Node();
            t=s;
            int ele=t.data;
            s=t.next;
            return ele;
        }
    }
    public void display()
    {
        Node t=new Node();
        t=s;
        if(s==null)
        {
            System.out.println("Stack is empty");
        }
        else{
        System.out.println("The elements are..");    
        while(t!=null)
        {
            System.out.print("-->"+t.data);
            t=t.next;
        }
        }
    }
}
class Prgrm5
{
    public static void main(String args[])
    {
        Scanner s1 =new Scanner(System.in);
        StackLL s=new StackLL();
        System.out.println("Enter elm into stack(-1 to stop)");
        int e=s1.nextInt();
        while(e!=-1)
        {
            s.push(e);
            System.out.println("Enter elem into stack");
            e=s1.nextInt();
        }
        s.display();
        int d =s.pop();
        System.out.println("The deleted elemt is"+d);
        System.out.println("After deletion ");
        s.display();

    }
}