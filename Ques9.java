import java.util.Scanner;
public class Ques9 {
	
	public static void main(String[] args)
	{
		Scanner input  = new Scanner(System.in);
		int n;
		int[] aryA;
		int[] aryB;
		int[] arySquare;
		
		System.out.print("Enter the value of n: ");
		n = input.nextInt();
			
		aryA = new int[n];
		aryB = new int[n];
		arySquare = new int[n];
		
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
		
		SquareXY(n,aryA,aryB,arySquare);
		
System.out.println("The Sum of square of the array is: ");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(arySquare[i]);
		}
	
	}
	
	public static void SquareXY (int n, int a[], int b[], int c[])
	{
		
		
		for(int i=0; i<n;i++)
		{
			c[i] = (a[i]*a[i]) + (b[i]*b[i]);
		}
		
		
	}

}
