import java.util.Scanner;
class Madam 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1 = sc.next();
		for (int i=1;i<s1.length ;i++ )
		{
			for (int j=s1.length;j>=1 ;j-- )
			{
				if (i==j)
				{
					System.out.println("Good");
				}
			}
		}
		if (i!=j)
		{
			System.out.println("bad");
		}
	}
}
