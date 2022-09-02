import java.util.*;
public class Prgrm25
{
	public static int linear(int a[],int n,int key)
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(key==a[i])
				return i;
		}
		return -1;
	}
    public static int rlinear(int a[],int lb,int ub,int key)
    {
        int i=lb;
        while(lb<ub)
        {
            if(key==a[i])
               return i;
            else
               return rlinear(a,lb+1,ub,key);
        }
        return -1;
    }
	public static void main(String args[])
	{
		Scanner s=new Scanner (System.in);
		int n,i,key;
		System.out.println("Enter no of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Enter key Value");
		key=s.nextInt();
		int loc= linear(a,n,key);
		if(loc==-1)
			System.out.println("Element is not there");
		else
			System.out.println("Element is found at " + loc);
        System.out.println("Using recursive linear serach");
        int idx=rlinear(a,0,n-1,key);
        if(idx==-1)
          System.out.println("Element not found");
        else
          System.out.println("Element found at "+idx);
	}


}