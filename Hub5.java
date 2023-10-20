import java.util.Scanner;
class Hub5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		if (n<0)
		{
			System.out.println("it is negative numbre");
		}
		if (n>0)
		{
			System.out.println("It is +ve Number!");
		}
		if (n==0)
		{
			System.out.println("It is neither +ve nor -ve");
		}

	}
}
