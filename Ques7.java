import java.util.Scanner;
public class Ques7 {

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] id,id1;
		float[] marks,marks1;
		
		id = new int[11];
		marks = new float[11];
		id1 = new int[10];
		marks1 = new float[10];
		
		marks[10] = 0;
		
		for (int i=0;i<10;i++)
		{
			System.out.print("Enter the ID of the student: ");
			id[i] = input.nextInt();
			
			System.out.print("Enter the marks of the student: ");
			marks[i] = input.nextInt();
		}
		int j;
		
		
		for (int i=0;i<10;i++)
		{
			for(j=i;j<10;j++)
			{
				if (marks[i] < marks[j])
				{
					marks1[i] = marks[j];
					id1[i] = id[j];
					
				}
			}
			
			for(j=i;j<10;j++)
			{
				if (marks[i] == marks[j])
				{
					marks1[j] = 0;
					break;
				}
			}
			
		}
		
		for (int i=0;i<10;i++)
		{
			System.out.print("ID of the student: "+id1[i]);
			
			
			System.out.println("  		the marks of the student: "+marks1[i]);
			
		}
		
	}
}
