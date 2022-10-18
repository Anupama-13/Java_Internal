import java.util.*;
class Node
{
    public int info;
    public Node ls;
    public Node rs;
}
class Prgrm27
{
    public static Node insert(Node r,int ele)
    {
        Node n =new Node();
        n.info=ele;
        Node p=new Node();
        Node t=new Node();
        if(r==null)
        {
            r=n;
        }
        else
        {
            p=null;
            t=r;
            while(t!=null)
            {
                if(t.info>ele)
                {
                    p=t;
                    t=t.ls;
                }
                else
                {
                    p=t;
                    t=t.rs;
                }
            }
            if(p.info>ele)
            {
                p.ls=n;
            }
            else{
                p.rs=n;
            }
        }
        return r;
    }
    public static boolean Rsearch(Node r,int key){
        if(r== null){
            return false;
        }
        if(r.info == key){

            return true;
        }
        else if (r.info>key){
            return Rsearch(r.ls, key);
        }
        else if(r.info<key){
            return Rsearch(r.rs,key);
        }
        return false; 
    }
    public static boolean NRsearch(Node r, int key)
    {
        if (r==null)
        {
            return false;
        }
       while(r!=null)
       {
        if(r.info==key)
        {
            return true;
        }
        else if(r.info>key)
        {
            r=r.ls;
        }
        else{
            r=r.rs;
        }
       }
       return false;
    }
    public static void main(String args[])
    {
        Node r= null;
        Scanner s=new Scanner(System.in);
        System.out.println("enter  nnumber of elements");
        int n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter element");
            int ele=s.nextInt();
            r=insert(r,ele);
        }
        System.out.println("Enter key");
        int key=s.nextInt();
        boolean idx=Rsearch(r,key);
        if(idx)
           System.out.println("Key is found");
        else
           System.out.println("Key not found");
        boolean idx1=NRsearch(r,key);
        if(idx1)
           System.out.println("Key is found");
        else
           System.out.println("Key not found");
    }
}
