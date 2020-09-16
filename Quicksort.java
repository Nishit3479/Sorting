import java.util.Scanner;
public class Quicksort 
{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size of Array :");
		int n=in.nextInt();
		int []A=new int[n];
		System.out.println("Enter The Elemets of Array :");
		for(int i=0;i<n;i++)
		{
			A[i]=in.nextInt();
		}
		System.out.println("Array Before Quick Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		quicksort(A,0,n-1);
		System.out.println("Array After Quick Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void quicksort(int []A,int left,int right)
	{
		int pivot=0;
		if(left<right)
		{
			pivot=partition(A,left,right);
		}
		if(pivot>1)
		{
			quicksort(A,left,pivot-1);
		}
		if(pivot+1<right)
		{
			quicksort(A,pivot+1,right);	
		}
	}
	public static int partition(int []A,int left,int right)
	{
		int pivot=A[left];
		while(true)
		{
			while(A[left]<pivot)
			{
				left++;
			}
			while(A[right]>pivot)
			{
				right--;
			}
			if(left<right)
			{
				if(A[left]==A[right])
				{
					return right;
				}
				int temp=A[left];
				A[left]=A[right];
				A[right]=temp;
			}
			else
			{
				return right;
			}
		}
	}
}
