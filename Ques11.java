import java.util.Scanner;
public class Ques11 {

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		String s;
		int n, i = 0;
		char c;
		char[] ary;
		
		System.out.print("Enter the characters: ");
		s = input.nextLine();
		
		n = s.length();
		
		ary = new char[n];
		
		do
		{
			c = s.charAt(i);
			ary[i] = c;
			i++;
		}
		while (c != '*');
		
		displayReverse(i, ary);
	}
	
	public static void displayReverse(int i, char[] ary)
	{
		char[] ary2;
		ary2 = new char[i+1];
		
		for(int j=i; j>=0;j--)
		{
			ary2[i-j] = ary[j];
			System.out.print(ary2[i-j]);
		}
	}

}
