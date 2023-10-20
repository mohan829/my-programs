import java.util.Scanner;
class Hub1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();
		//callie method
		System.out.println("the factorial of given number is :"+factorial(n));

	}
	//called method
	public static int factorial(int n){
		if (n<0)
		{
			return -1;
		}
		if (n==0)
		{
			return 1;

		}
	return n*factorial(n-1);
	}
}
