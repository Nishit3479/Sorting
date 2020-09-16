import java.util.Scanner;
public class BubbleSort 
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
		System.out.println("Array Before Bubble Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
		bubblesort(A,n);
		System.out.println("Array After Bubble Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		System.out.println();
	}
	public static void bubblesort(int []A,int n)
	{
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(A[i]>A[j])				//'>' for Ascending
				{					//'<' for Descending
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
	}
}
