import java.util.*;
class Prgrm1
{
    public static void bubsort(int a[])
	{
		int n= a.length;
		for(int pass=0;pass<n-1;pass++)
		{
			for(int i=0;i<n-1;i++)
		    {
			   if(a[i]>a[i+1])
		      {
				  int temp;
				  temp=a[i];
				  a[i]=a[i+1];
				  a[i+1]=temp;
			  }
			}
		}
	}
    public static int binary(int a[],int n,int key)
	{
		int i;
		int lb=0,ub=n-1;
		while(lb<=ub)
		{
			int mid=(lb+ub)/2;
			if(key==a[mid])
				return mid;
			else if(key<a[mid])
				ub=mid-1;
			else
				lb=mid+1;
		}
		return -1;

	}
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
		int n,i,key;
		System.out.println("Enter no of elements");
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		bubsort(a);
		System.out.println("The sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
        System.out.println("\nEnter key value to search");
        key=s.nextInt();
        int idx=binary(a,n,key);
        if(idx==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + idx);
        }

    }
}