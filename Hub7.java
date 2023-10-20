import java.util.Scanner;
class Hub7 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year!");
		int year = sc.nextInt();
		if (year%4==0)
		{
			System.out.println("It is a leap Year!");
		}
		else{
			System.out.println("It is not a Leap year");
		}
			
	}
}
