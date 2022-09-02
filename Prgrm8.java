import java.util.*;
class Prgrm8
{
	public static int partition(int a[],int lb, int ub)
	{
		int i=lb;
		int j=ub;
		int pivot=a[lb];
		while(i<j)
		{
			while(a[i]<=pivot && i<ub)
				i=i+1;
			while(a[j]>pivot && j>lb)
				j=j-1;
			if(i<j)
			{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
		a[lb]=a[j];
		a[j]=pivot;
		return j;
	}
	public static void quick(int arr[],int lb,int ub)
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
		int a[]=new int[n];
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		quick(a,0,n-1);
		System.out.println("Sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
		
}