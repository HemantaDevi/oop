import java.util.Scanner;
public class Ques5 {
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		String txt;
		char[] text;
		int counter1 = 0, counter2 = 0;
		
		System.out.println("Enter text here");
		txt = input.nextLine();
		
		text = new char[txt.length()];
		 for (int i=0; i < txt.length(); i++ )
		 {
			 text[i] = txt.charAt(i);
			 
			 if (text[i] != ' ')
			 {
				 counter1++;

				 switch(text[i])
				 {
				 case 'a':
				 case 'A':
				 case 'e':
				 case 'E':
				 case 'i':
				 case 'I':
				 case 'o':
				 case 'O':
				 case 'u':
				 case 'U':
					 counter2++;
					 break;
				 }
			 }
		 }
		 
		 System.out.println("The number of words is: "+counter1);
		 System.out.println("The number of vowels is: "+counter2);
		 
	}

}
