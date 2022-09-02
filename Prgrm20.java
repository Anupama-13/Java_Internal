import java.util.*;
class Prgrm20
{
   public static void bubsort(String a[])
	{
		int n= a.length;
		for(int pass=0;pass<n-1;pass++)
		{
			for(int i=0;i<n-1;i++)
		    {
			   if(a[i].compareTo(a[i+1])>0)
		      {
				  String temp;
				  temp=a[i];
				  a[i]=a[i+1];
				  a[i+1]=temp;
			  }
			}
		}
	}
    public static int rbinary(String a[],int lb,int ub,String key)
	{
		if(lb<=ub)
		{
			int mid=(lb+ub)/2;
            int v=a[mid].compareTo(key);
			if(v==0)
				return mid;
			else if(v<0)
				return rbinary(a,lb,mid-1,key);
			else
				return rbinary(a,mid+1,ub,key);
		}
		return -1;
	}
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
		int n,i;
        String key;
		System.out.println("Enter no of elements");
		n=s.nextInt();
		String a[]=new String[n];
		System.out.println("Enter the Names");
		for(i=0;i<n;i++)
			a[i]=s.next();
		bubsort(a);
		System.out.println("The sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
        System.out.println("\nEnter name to search");
        key=s.next();
        int idx=rbinary(a,0,n-1,key);
        if(idx==-1){
            System.out.println("Name not found");
        }
        else{
            System.out.println("Name found at index " + idx);
        }

    }
}