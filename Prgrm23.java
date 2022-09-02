import java.util.*;
public class Prgrm23
{
	public static int partition(String a[],int lb, int ub)
	{
		int i=lb;
		int j=ub;
		String pivot=a[lb];
		while(i<j)
		{
			while(a[i].compareTo(pivot)<=0)
				i=i+1;
			while(a[j].compareTo(pivot)>0)
				j=j-1;
			if(i<j)
			{
				String t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		a[lb]=a[j];
		a[j]=pivot;
		return j;
	}
	public static void quick(String arr[],int lb,int ub)
	{
		if(lb<ub)
		{
			int pos= partition(arr,lb,ub);
			quick(arr,lb,pos-1);
			quick(arr,pos+1,ub);
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i;
		System.out.println("Enter the no of elements");
		n=s.nextInt();
		String a[]=new String[n];
		System.out.println("Enter Names");
		for(i=0;i<n;i++)
			a[i]=s.next();
		quick(a,0,n-1);	
		System.out.println("Sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
		
}