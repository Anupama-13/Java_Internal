import java.util.*;
class Node
{
    public int data;
    public Node ls;
    public Node rs;
}
class Prgrm28
{

    public static Node construct(Node r)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("ENter element");
        int ele=s.nextInt();
        if (ele != -1)
        {
            r=new Node();
            r.data=ele;
            //r.ls;
            //r.rs;
            r.ls=construct(r.ls);
            r.rs=construct(r.rs);
        }
        else{
            r=null;
        }
        return r;
    }
    public static void preorder(Node r)
    {
        if(r!=null)
        {
            System.out.print(r.data+" ");
            preorder(r.ls);
            preorder(r.rs);
        }
    }
     public static void inorder(Node r)
    {
        if(r==null)
        {
            return;
        }
        inorder(r.ls);
        System.out.print(r.data +" ");
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
        System.out.print(r.data +" ");
    }
    public static void main(String args[])
    {
        Node r=null;
        r=construct(r);
        System.out.println("\nPre order tarversal is :");
        preorder(r);
        System.out.println("\nInorder tarversal is :");
        inorder(r);
        System.out.println("\nPostorder tarversal is :");
        postorder(r);
    }
}