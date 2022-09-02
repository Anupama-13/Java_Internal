import java.util.*;
class Prgrm10
{
	public static void merge (String a[],int lb,int mid,int ub)
	{
		int n1=mid-lb+1;
		int n2=ub-mid;
		String leftarr[]=new String[n1];
		String rightarr[]=new String[n2];
		for(int i=0;i<n1;i++)
		  leftarr[i]=a[lb+i];
		for(int i=0;i<n2;i++)
		   rightarr[i]=a[mid+1+i];
		int i=0,j=0,k=lb;
		 while (i < n1 && j < n2)    
       {    
        if(leftarr[i].compareTo(rightarr[j])<=0)    
        {    
            a[k] = leftarr[i];    
            i++;    
        }    
        else    
        {    
            a[k] = rightarr[j];    
            j++;    
        }    
        k++;    
       }    
       while (i<n1)    
       {    
           a[k] = leftarr[i];    
           i++;    
           k++;    
        }    
      
        while (j<n2)    
       {    
            a[k] = rightarr[j];    
            j++;    
            k++;    
        }    
    }
	public static void mersort(String a[],int lb,int ub)
	{
		if(lb<ub)
		{
			int mid=(lb+ub)/2;
			mersort(a,lb,mid);
			mersort(a,mid+1,ub);
			merge(a,lb,mid,ub);

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
		mersort(a,0,n-1);
		System.out.println("Sorted array");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
	}
		
}