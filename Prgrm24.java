import java.util.*;
class Cqueue
{
    static int f=-1,r=-1,r1=-1;
    int q[];
    Cqueue(int size)
    {
        q=new int[size];
    }
    public boolean isEmpty()
    {
        if(f==-1)
          return true;
        else 
           return false;
    }
    public boolean isFull()
    {
        if(r1==f)
           return true;
        else
          return false;
    }
    public void enqueue(int ele)
    {
        if(r==q.length-1)
           r1=0;
        else
           r1=r+1;
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else 
          r=r1;
        q[r]=ele;
        if(f==-1)
          f=0;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue if empty");
            return -1;
        }
        int dlt=q[f];
        if(f==r)
           f=r=-1;
        if(f==q.length-1)
           f=0;
        else
           f=f+1;
        return dlt;
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
        }
        else
        {
            System.out.println("Queue elements are..");
            if(r>=f)
            {
                for(int i=f;i<=r;i++)
                   System.out.print(q[i]+" ");
            }
            else
            {
                for(int i=f;i<q.length;i++)
                   System.out.print(q[i]+" ");
                for(int i=0;i<=r;i++)
                   System.out.print(q[i]+" ");
            }
        }
    }   
}
class Prgrm24
{
   public static void main(String args[])
   {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s1.nextInt();
        Cqueue q=new Cqueue(n);
        for(int i = 0 ; i<n ;i++)
        {
            int elem = s1.nextInt();
            q.enqueue(elem);
        }
        q.display();
        int d=q.dequeue();
        System.out.println("\nDeleting  element "+ d);
        System.out.println(" After deletion ");
        q.display();
        d=q.dequeue();
        System.out.println("\nDeleting  element "+ d);
        System.out.println(" After deletion ");
        q.display();
        System.out.println("Enter elmeent inot queue");
        int e1=s1.nextInt();
        q.enqueue(e1);
        q.display();
   }

}