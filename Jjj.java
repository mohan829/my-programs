import java.util.Scanner;

class Example5
{ 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the first number :");
	 int a = sc.nextInt();
	 System.out.println("Enter Second number:");
	 int b = sc.nextInt();

	 int temp = a;
	 	 a=b;
		 b=temp;
	}
}