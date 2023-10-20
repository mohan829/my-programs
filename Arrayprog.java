import java.util.Scanner;
class Arrayprog 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.println("Enter the value:");
			arr[i]=sc.nextInt();
		}
		System.out.println("the entered values are:");
		for (int i=0;i<arr.length ;i++ )
		{
			System.out.print(arr[i]+" ");

		}
		
		

	}
}
