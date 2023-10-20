import java.util.Scanner;
class Hub11 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i=2;i<=n/2;i++)
		{
				if (n%2==0)
			{
				flag=false;
				break;
			}

		}
		if (flag==true)
		{
			System.out.println("It is prime number!");
		}
		else
			System.out.println("It is not prime no.!");
		
	}
}
