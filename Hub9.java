import java.util.Scanner;
class Hub9 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number:");
		int option =sc.nextInt();
		switch(option)
		{
			case 100:
				System.out.println("It is Police Emergency number!");
			break;
			case 108:
				System.out.println("It us Ambulance Number!");
			break;
			case 198:
				System.out.println("It us child help line");
			default :
				System.out.println("Invalid number!");
		}

	}
}
