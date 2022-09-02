import java.util.*;
class Prgrm21
{
   public static void selsort(String a[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int mi=i;
			String me=a[mi];
			for(int j=i+1;j<n;j++)
			{
				if(a[j].compareTo(me)<0)
				{
					me=a[j];
					mi=j;
				}
			}
			if(i!=mi)
			{
				a[mi]=a[i];
				a[i]=me;
			}
		}

	}
    public static int rbinary(String a[],int lb,int ub,String key)
	{
		int i;
		while(lb<=ub)
		{
			int mid=(lb+ub)/2;
            int v=key.compareTo(a[mid]);
			if(v==0)
				return mid;
			else if(v<0)
				rbinary(a,lb,mid-1,key);
			else
				rbinary(a,mid+1,ub,key);
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
		selsort(a,n);
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