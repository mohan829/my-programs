import java.util.Scanner;
class Nthelement 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		//called method
		System.out.println("The N-th element of a number is:"+fib(n));
		
	}
	//callie method 
	public static int fib(int n)
	{
		if (n==1 || n==0)
		
			return 0;
		
		if (n==2)
		
			return 1;

		
		return fib(n-1)+fib(n-2);
	}
}
