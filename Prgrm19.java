import java.util.*;
class Node
{
    public int data;
    public Node lptr;
    public Node rptr;
}
class StackDLL
{
    public Node s;
    StackDLL()
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
        t.lptr=null;
        t.rptr=null;
        if(s==null)
           s=t;
        else{
            t.rptr=s;
            s.lptr=t;
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
            s=t.rptr;
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
            t=t.rptr;
        }
        }
    }
    public void disp_rev()
    {
        Node t=new Node();
        t=s;
        if(s==null)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("\nThe elements in Reverse order are..");
            int a[]=new int[50];
            int i=0;
            while(t!=null && i>=0)
            {
                a[i]=t.data;
                i++;
                t=t.rptr;
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.print(a[j]+"-->");
            }
        }
    }
}
class Prgrm19
{
    public static void main(String args[])
    {
        Scanner s1 =new Scanner(System.in);
        StackDLL s=new StackDLL();
        System.out.println("Enter elm into stack(-1 to stop)");
        int e=s1.nextInt();
        while(e!=-1)
        {
            s.push(e);
            System.out.println("Enter elem into stack");
            e=s1.nextInt();
        }
        s.display();
        s.disp_rev();
        int d =s.pop();
        System.out.println("\nThe deleted elemt is"+d);
        System.out.println("After deletion ");
        s.display();

    }
}