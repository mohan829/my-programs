import java.util.Scanner;
class Operators
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = sc.nextInt();
		System.out.println("Enter the second number :");
		int b = sc.nextInt();

		int i = (a>b)?(a:b);
		System.out.println("The result is as :"+i);

	}
}