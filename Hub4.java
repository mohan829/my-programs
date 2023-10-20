import java.util.Scanner;
class Hub4 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age =sc.nextInt();
		if (age>18)
		{
			System.out.print("You are elgible to vote!");
		}
		else {
			System.out.println("You are not elgible to Vote!");
		}
	}
}
