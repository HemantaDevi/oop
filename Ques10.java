
public class Ques10 {

	public static void main (String [] args) {
	int[] ary1 = { 21,14,53,12,42,35,52,71,75};
	int n = 5;
	int largest;
	
	largest = getLargest(n,ary1);
	
	System.out.print(largest);
	}
	
	public static int getLargest(int n,int[] ary)
	{
		int max=0;
		for (int i=0; i<n; i++)
		{
			if(ary[i] > max)
				max = ary[i];
		}
		return (max);
	}
	
}