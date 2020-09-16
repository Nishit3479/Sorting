import java.util.Scanner;
public class SelectionSort 
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
		System.out.println("Array Before Selection Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		selsort(A,n);
		System.out.println("Array After Selection Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void selsort(int A[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int min=i;
			for(int j=i+1;j<n;j++)
			{
				if(A[min]>A[j])			//'>' for Ascending
				{				//'<' for Descending
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=A[min];
				A[min]=A[i];
				A[i]=temp;
			}
		}
	}
}
