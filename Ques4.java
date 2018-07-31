import java.util.Scanner;
public class Ques4 {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float sum = 0,avg;
		float[] arySales;
		
		arySales = new float[12];
		
		for (int i = 1; i <=arySales.length; i++)
		{
			System.out.print("Enter salary for month "+i +" : ");
			arySales[i] = input.nextFloat();
			
			sum += arySales[i];
		}
		avg = sum / 12;
		
		System.out.print("THe average sales is: "+avg);
	}

}
