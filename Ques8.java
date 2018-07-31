import java.util.Scanner;
public class Ques8 {
	
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		int n;
		int[] aryA;
		int[] aryB;
		int[] arySum;
		
		System.out.print("Enter the value of n: ");
		n = input.nextInt();
			
		aryA = new int[n];
		aryB = new int[n];
		arySum = new int[n];
		
		System.out.println("Enter the values for the first array: ");
		
		for(int i=0; i<n; i++)
		{
			aryA[i] = input.nextInt();
		}
		
System.out.println("Enter the values for the second array: ");
		
		for(int i=0; i<n; i++)
		{
			aryB[i] = input.nextInt();
		}
		
		SumXY(n,aryA,aryB,arySum);
		
System.out.println("The Sum of the array is: ");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arySum[i]);
		}
	
	}
	
	public static void SumXY (int n, int a[], int b[], int c[])
	{
		
		
		for(int i=0; i<n;i++)
		{
			c[i] = a[i] + b[i];
		}
		
		
	}

}
