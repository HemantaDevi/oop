import java.util.Scanner;
public class Ques6 {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n,min,max;
		int[] arry;
		
		System.out.print("How many number do you want to Enter: ");
		n = input.nextInt();
		
		arry = new int[5];
		
		for (int i=0; i<n;i++)
		{
			System.out.print("Enter Number "+i +": ");
			arry[i] = input.nextInt();
		}
		min = arry[0];
		max = arry[0];
		
		for (int i=0; i<n;i++)
		{
			if(arry[i] < min)
				min = arry[i];
			
			if(arry[i] > max)
				max = arry[i];
			
		}
	
		System.out.print("Maximum is "+max);
		System.out.print("Maximum is "+min);
		
	}

}
