import java.util.Scanner;
class Hub10 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int a=0,b=1,c;
		for (int i=2;i<=n ;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
