import java.util.Scanner;
class Mult
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the Second number :");
		int b = sc.nextInt();
		System.out.println("Enter the third number : ");
		int c = sc.nextInt();

		int min =(a<b)?((a<c)?a:c):((b<c)?b:c);
		System.out.println("The min of the numbers is: "+min);

	}
}