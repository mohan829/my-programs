import java.util.Scanner;
class Tables 
{
	public static void main(String[] args) 
	{
	 
	while (true)
	{
		 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the table u want:");
	 int n =sc.nextInt();
	 int i=1;
	 
	 do
	 {
		 System.out.println(n+"*"+i+"="+n*i);
		 i++;
	 }
	 while (i<=10);
	  
	}
	
	
	}
}
