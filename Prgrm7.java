import java.util.*;
class Queue
{
    static int f=-1,r=-1;
    int q[];
    Queue(int size)
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
        if(r==q.length-1)
          return true;
        else 
          return false;
    }
    public void enqueue(int ele)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            r=r+1;
            q[r]=ele;
            if(f==-1)
               f=0;
        }
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int dlt=q[f];
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else
           f=f+1;
        return dlt;
    }
    public void display()
    {
        if(isEmpty())
          System.out.println("Queue is empty");
        else
        {
            System.out.println("Queue elements are..");
            for(int i=f;i<=r;i++)
            {
                System.out.println(q[i]+" ");
            }
        }
    }
}
class Prgrm7
{
   public static void main(String args[])
   {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=s1.nextInt();
        Queue q=new Queue(n);
        for(int i = 0 ; i<n ;i++)
        {
            int elem = s1.nextInt();
            q.enqueue(elem);
        }
        q.display();
        int d=q.dequeue();
        System.out.println("\nDeleting  element "+ d);
        System.out.println(" After deletion queue elements are..");
        q.display();
   }

}