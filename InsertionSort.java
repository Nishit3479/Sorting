import java.util.Scanner;
public class InsertionSort
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
		System.out.println("Array Before Insertion Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		inssort(A,n);
		System.out.println("Array After Insertion Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void inssort(int []A,int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp=A[i];
			int j=i-1;
			while(j>=0 && A[j]>temp)			//'>' for Ascending		
			{									//'<' for Descending
				A[j+1]=A[j];
				j--;
			}
			A[j+1]=temp;
		}
	}
}
