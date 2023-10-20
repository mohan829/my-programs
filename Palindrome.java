import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string value:");
		String str=sc.next().CharAt[0];
		char[] carr= str.toCharArray();
		String rev = "";
		for (int i=carr.length-1;i>=0 ;i-- )
		{
			rev +=carr[i];
		}
			if (str.equals(rev))
			{
				System.out.println("It is palindrome!");
			}
			else{
				System.out.println("It is not a palindrome!");
			}
	}
}
