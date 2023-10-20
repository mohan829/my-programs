import java.util.Scanner;
class Hub2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a =sc.nextInt();
		//callie method
		System.out.println("The Fact of The Given number is:"+factorial(a));
	}
	public static int factorial(int a){
		if (a<0)
		{
			return -1;

		}
		if (a==0)
		{
			return 1;
		}
		
	return a*factorial(a-1);
	}
}
