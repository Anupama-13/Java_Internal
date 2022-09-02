import java.util.*;
class Prgrm22
{
    public static void inssort(String a[],int n)
	{
		for (int i=1;i<n;i++)
		{
			String t=a[i];
			int j=i-1;
			boolean flag=false;
			while((j>=0)&&(!flag))
			{
				if(t.compareTo(a[j])<0)
				{
					a[j+1]=a[j];
					a[j]=t;
					j=j-1;
				}
				else
					flag=true;
			}
		}
	}
    public static int binary(String a[],int n,String key)
	{
		int i;
		int lb=0,ub=n-1;
		while(lb<=ub)
		{
			int mid=(lb+ub)/2;
            int val=key.compareTo(a[mid]);
			if(val==0)
				return mid;
			else if(val<0)
				ub=mid-1;
			else
				lb=mid+1;
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
		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
			a[i]=s.next();
		inssort(a,n);
		System.out.println("The sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
        System.out.println("\nEnter key value to search");
        key=s.next();
        int idx=binary(a,n,key);
        if(idx==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index " + idx);
        }

    }
}