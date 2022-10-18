import java.util.*;
class Node
{
    public int info;
    public Node ls;
    public Node rs;
}
class Prgrm26
{
    public static Node insert(Node r,int ele)
    {
        Node n= new Node();
        n.info=ele;
        if(r==null)
        {
            r=n;
            return r;
        }
        else if(ele<r.info)
        {
            r.ls=insert(r.ls,ele);
        }
        else{
            r.rs=insert(r.rs,ele);
        }
        return r;
    }    
    public static void preorder(Node r)
    {
        if(r==null)
        {
            return;
        }
        System.out.print(r.info +" ");
        preorder(r.ls);
        preorder(r.rs);
    }
     public static void inorder(Node r)
    {
        if(r==null)
        {
            return;
        }
        inorder(r.ls);
        System.out.print(r.info +" ");
        inorder(r.rs);
    }
     public static void postorder(Node r)
    {
        if(r==null)
        {
            return;
        }
        postorder(r.ls);
        postorder(r.rs);
        System.out.print(r.info +" ");
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
        System.out.println("\nPre order tarversal is :");
        preorder(r);
        System.out.println("\nInorder tarversal is :");
        inorder(r);
        System.out.println("\nPostorder tarversal is :");
        postorder(r);
    }

}
