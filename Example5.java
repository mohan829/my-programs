import java.util.Scanner;
class Swaping
{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number :");
		int a = sc.nextInt();
		System.out.println("Enter the second nuber:");
		int b = sc.nextInt();

		System.out.ptintln("The values before swapping are "+a+" and "+b);
		int a=b;
		    b=a-b;
			a=a-b;

		System.out.println("The values after swapping are "+a+" and  "+b);
	}

}