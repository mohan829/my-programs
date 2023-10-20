import java.util.Scanner;
class Hub6 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n =sc.nextInt();
		if (n%2==0)
		{
			System.out.println("It is Even no.");
		}
		else{
			System.out.println("it is not an Even number!");
		}
	}
}
